//Q.2)Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
package March13WED.example;
import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[15];
		int i,n,sumEven=0,sumOdd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of integer: ");
		n=sc.nextInt();
		System.out.println("Enter the integer:");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) 
			{
				sumEven=sumEven+arr[i];
			}
			else
			{
				sumOdd=sumOdd+arr[i];
			}
		}
		System.out.println("Sum of Even integers: "+sumEven);
		System.out.println("Sum of Odd integers: "+sumOdd);
	}

}
