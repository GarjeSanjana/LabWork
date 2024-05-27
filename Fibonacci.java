//Q.1) WAP to generate fibonacci series 0 1 1 2 3 5 8
package March21THU.example;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,t,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Count:");	//To get count from user.
		count=sc.nextInt();
		System.out.println(n1+"\n"+n2);		//Printing 0 and 1
		for(int i=2;i<count;i++)			//Loop starts from 2 because 0 and 1 already printed.
		{
			t=n1+n2;
			System.out.println(t);
			n1=n2;
			n2=t;
		}
	}

}
