import java.util.Arrays;

public class indexsame {

	public static void main(String[] args) 
	{
		int c=0;
	int a[]=new int[args.length];
	for(int i=0;i<args.length;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	Arrays.sort(a);
	for(int j=0;j<args.length;j++)
	{
		if(j==a[j])
		{
			c++;
			System.out.println(j);
		}
		
	}
	if(c==0)
		System.out.println("no such elements found");
    
	}

}
