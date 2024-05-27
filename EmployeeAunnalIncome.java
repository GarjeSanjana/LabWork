/*1)Write a program in Java to accept the name of an employee and his/her annual income. 
Pass the name and the annual income. Displays the name of the employee and the income tax as per
the given tariff:
Annual Income									Income Tax
Up to ₹2,50,000									No tax

₹2,50,001 to ₹5,00,000			                10% of the income exceeding ₹2,50,000

₹5,00,001 to ₹10,00,000							₹30,000 + 20% of the amount exceeding   ₹5,00,000

₹10,00,001 and above							₹50,000 + 30% of the amount exceeding ₹10,00,000
 */
package March28THU.example;
import java.util.*;
class EmpIncomeDetails
{
	String Emp_Name;
	double Aunnal_Income,PayTax;
	Scanner sc=new Scanner(System.in);
	//To get employee name and aunnal income
	public void getInfo()
	{
		System.out.println("Enter your Name:");
		Emp_Name=sc.nextLine();
		System.out.println("Enter Your Annual Income:");
		Aunnal_Income=sc.nextDouble();
		sc.nextLine();
	}
	//To display employee name and income tax amount as per given condition.
	public void showInfo()
	{
		System.out.println("Employee Name is "+Emp_Name);
		if (Aunnal_Income<=250000)
		{
			System.out.println("You don't have to Pay Income Tax as your Annual Income is less than RS.2,50,000");
		}
		else if(Aunnal_Income>250001 && Aunnal_Income<=500000)
		{
			PayTax=(0.1*(Aunnal_Income-250000));
			System.out.println("Income Tax amount is "+PayTax);
		}
		else if(Aunnal_Income>500001 && Aunnal_Income<=1000000)
		{
			PayTax=(30000+0.2*(Aunnal_Income-500000));
			System.out.println("Income Tax amount is "+PayTax);
		}
		else if(Aunnal_Income<1000000)
		{
			PayTax=(50000+0.3*(Aunnal_Income-1000000));
			System.out.println("Income Tax amount is "+PayTax);
		}
	}
}

public class EmployeeAunnalIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created an class object.
		EmpIncomeDetails obj=new EmpIncomeDetails();
		//calling methods
		obj.getInfo();
		obj.showInfo();
	}

}
