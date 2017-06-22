public class repeatingnum {

	public static void main(String[] args)
	{
     int c=0;
     int ch[]=new int[args.length];
     int ch1[]=new int[args.length];
     for(int i=0;i<args.length;i++)
     {
    	 ch[i]=Integer.parseInt(args[i]);
     }
     for(int j=0;j<args.length;j++)
     {
    	 if(j<args.length-1)
    	 {
    	 for(int k=j+1;k<args.length;k++)
    	 {
    		if(ch[j]==ch[k])
    		{
    			for(int s=0;s<ch.length;s++)
    			{
    				if(ch1[s]!=ch[j])
    				{
    			ch1[c]=ch[k];
    			
    		}
    			}
    			c++;
    		}
    	 }
    	 }
     }
	if(c>0)
	{
     	   for(int m=0;m<c;m++)
           System.out.println(ch1[m]);
	}
		else 
			System.out.println("No repeated numbers");
     
	}

}
