//Q.1)WAP to find Greatest among three number using Nested if
package March13WED.example;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}
		else if(b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
	}
}
