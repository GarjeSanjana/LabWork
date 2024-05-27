//3)WAP to Reverse a string with the help of loop.
package March28THU.example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;						//To get string from user.
		str2="";								
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		str1=sc.nextLine();
		for(int i=0;i<str1.length();i++)		//To reverse the string.
		{
			str2=str1.charAt(i)+str2;			
		}
		System.out.println(str2);				//Printing reversed string.
	}

}
