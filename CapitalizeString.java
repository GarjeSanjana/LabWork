//Q.3)Write a java program to capitalize each word in string.
package April23TUE.example;

import java.util.Scanner;

public class CapitalizeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();						//Reading string from user
		String capitalize=name.toUpperCase();	//to convert name in uppercase
		System.out.println("Original String: "+name);	
		System.out.println("Capitalized String: "+capitalize);
	}

}
