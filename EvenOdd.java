//Q.2) WAP to generate even and odd numbers between 1 and 100
package March21THU.example;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		System.out.println("Even numbers from 1 to 100: ");
		for(int i=1;i<=n;i++)					//Loop for even numbers
		{
			if(i%2==0)							//Condition to check number is even
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\nOdd Numbers from 1 to 100: ");
		for(int i=1;i<=n;i++)					//Loop for Odd numbers
		{
			if(i%2!=0)							//Condition to check number is odd
			{
				System.out.print(i+" ");
			}
		}
	}

}
