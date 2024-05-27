/*2)Write a class with the name Perimeter using Menu driven(Switch case) that computes the perimeter 
of a square, a rectangle and a circle.
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r
*/
package March28THU.example;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;									//To get choice form user.
		Scanner sc=new Scanner(System.in);
		System.out.println("1.To Find Perimeter of Square");
		System.out.println("2.To Find Perimeter of Rectangle");
		System.out.println("3.To Find Perimeter of Circle");
		System.out.println("Enter your Chioice:");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:									//To find Perimeter of Square
			double s;
			System.out.println("Enter Side:");
			s=sc.nextDouble();
			System.out.println("Perimeter of Square= "+(4*s));
			break;
		case 2:									//To find Perimeter of Square
			double l,b;
			System.out.println("Enter Length and Breadth:");
			l=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("Perimeter of Rectangle= "+(2*(l+b)));
			break;
		case 3:									//To find Perimeter of Square
			double r;
			System.out.println("Enter Radius:");
			r=sc.nextDouble();
			System.out.println("Perimeter of Circle= "+(2*(22/7)*r));
			break;
		case 4:
			System.out.println("Invalid Choice");
		}
	}

}
