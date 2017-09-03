import java.util.*;
public class tallest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
          arr[i]=sc.nextInt();  
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }
}
