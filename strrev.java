import java.util.Scanner;

public class strrev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		String ans[]=new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			String s2=new StringBuffer(s[i]).reverse().toString();
			ans[i]=s2;
		}
		for(int j=0;j<ans.length;j++)
			System.out.print(ans[j]+" ");
		sc.close();

	}

}
