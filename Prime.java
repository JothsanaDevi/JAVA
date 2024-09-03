import java.util.*;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,flag=0;
		if(n==0||n==1)
		{
			flag=1;
		}
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println(" Not a prime");
		}

	}

}
