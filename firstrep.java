import java.util.Arrays;

public class firstrep {

	public static void main(String[] args) 
	{
		int ch1[]=new int[args.length];
	     for(int i=0;i<args.length;i++)
	     {
	    	 ch1[i]=Integer.parseInt(args[i]);
	     }	
	     Arrays.sort(ch1);
	     for(int j=0;j<args.length;j++)
	     {
	    	 if(ch1[j]==ch1[j+1])
	    		 System.out.println(ch1[j]);
	    	 break;
	     }

	}

}
