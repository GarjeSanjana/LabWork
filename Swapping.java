//Q.2)WAP to swap two numbers without using third variable using class and object concept.
package April08MON.example;

import java.util.Scanner;

public class Swapping {
	public void swap(int a,int b)
	{
		System.out.println("Before Swapping value of a and b: ");
		System.out.println("a="+a+"\nb="+b);		//Printing a and b value before swapping.
		//To swap two number without using third variable.
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping value of a and b: ");
		System.out.println("a="+a+"\nb="+b);		//Printing a and b value after swapping.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers:");	//To get two numbers from user.
		a=sc.nextInt();
		b=sc.nextInt();
		Swapping s=new Swapping();						//Creating an object of Swapping.
		s.swap(a,b);
	}

}
