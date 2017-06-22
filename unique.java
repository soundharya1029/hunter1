import java.util.Arrays;
import java.util.Scanner;

public class unique {

	public static void main(String[] args) 
	{
		int s=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ch[]=new int[n];
		for(int i=0;i<n;i++)
		{
		  ch[i]=sc.nextInt();	
		}
		Arrays.sort(ch);
        for(int j=0;j<ch.length;j++)
        {
        	if(j==ch.length-1 && ch.length%2!=0)
        	{
        		System.out.println(ch[j]);
        	}
        	else
        	{
        	for(int k=j+1;k<ch.length;k++)
        	{
        		if(ch[j]!=ch[k])
        		{
        			System.out.println(ch[j]);
        			break;
        	    }
        			j++;
        			break;
        	}
        	}
        }
       
	}

}
