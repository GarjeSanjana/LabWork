/*Q.2) Write a program that asks the user to input ten integers and stores them in an array.
The program should then find and print the smallest and largest values in the array.
*/
package April11THU.example;

import java.util.Scanner;

public class SmallestLargestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];						//Creating array of size 10.			
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ten numbers:");	//To get Ten integer form user.
		for(i=0;i<10;i++) 
		{
			arr[i]=sc.nextInt();
		}
		//assign first element of an array to largest and smallest
		int smallest = arr[0];
		int largest = arr[0];
		for (i = 1;i<arr.length;i++) 
		{
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println("Largest Number is : " + largest);		//Printing Largest number
		System.out.println("Smallest Number is : " + smallest);		//Printing Smallest number
	}

}
