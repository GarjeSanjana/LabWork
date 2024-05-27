//Q.3)WAP to check whether the entered number is prime or not
package March21THU.example;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;								//variable declaration
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");	//To get number from user.
		num=sc.nextInt();
		for(int i=2;i<=num/2;i++)				
		{
			if(num%i==0)						//Condition for nonprime number
			{
				flag=true;
				break;
			}
		}
		if(!flag)								
		{
			System.out.println(num+" is a prime");
		}
		else
		{
			System.out.println(num+" is not a prime");
		}
	}

}
