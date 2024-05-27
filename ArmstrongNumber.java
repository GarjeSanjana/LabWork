//Q.1)WAP to check Whether the number is Armstrong number or not using class and object concept.
package April08MON.example;

import java.util.Scanner;

public class ArmstrongNumber {
	public void check(int n)		//Method to check number is armstrong or not.
	{
		int rem,arm=0,t;
		t=n;						//Assigning n into t variable
		while(n>0)					//loop execute until the condition becomes false.
		{
			rem=n%10;
			arm=arm+rem*rem*rem;
			n=n/10;
		}
		if(t==arm)					//compares the arm with n
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
		System.out.println("Number not is Armstrong");	
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");		//To get number from user.
		num=sc.nextInt();
		ArmstrongNumber an=new ArmstrongNumber();	//Creating an object of ArmstrongNumber
		an.check(num);	
	}

}
