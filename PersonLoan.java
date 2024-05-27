/*Q.3)WAP to check whether the person is eligible for getting loan or not.
Condition to grant loan is he should have salary more than 50000 and He should be citizen of INDIA.
Otherwise Loan can't be given to customer.*/


package March13WED.example;
import java.util.Scanner;

public class PersonLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary;
		String citizen;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary:");
		salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your Citizen:");
		citizen=sc.next();
		if(salary>=50000 && citizen.equalsIgnoreCase("Indian"))
		{
			System.out.println("Congrats..! :) You are eligible for loan");
		}
		else
		{
			System.out.println("Sorry..! :( You are not eligible for laon");
		}
	}

}
