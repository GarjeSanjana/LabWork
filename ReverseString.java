//Q.2)WAP a program to reverse a given String without using reverse() method.
package April23TUE.example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;						
		str2="";								
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		str1=sc.nextLine();						//Reading string from user.
		for(int i=0;i<str1.length();i++)		//To reverse the string.
		{
			str2=str1.charAt(i)+str2;			
		}
		System.out.println(str2);				//Printing reversed string.    
	}

}
