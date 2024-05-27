/*Q.3)Create a class Student having roll_number, Name as fields.
Create another class Marksdetails to accept 5 subject marks.
Apply Single Inheritance to display the result*/
package April08MON.example;

import java.util.Scanner;
//Student class
class Student 
{
	private int rollNumber;
	private String name;
	// Constructor
	public Student(int rollNumber, String name) 
	{
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public int getRollNumber() 
	{
		return rollNumber;
	}
	public String getName() 
	{
		return name;
	}
}
//MarksDetails class inheriting from Student
class MarksDetails extends Student
{
	private int[] marks = new int[5];
	double add,res;
	// Constructor
	public MarksDetails(int rollNumber, String name)
	{
		super(rollNumber, name);
	}
	// Method to accept marks
	public void acceptMarks() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks for 5 subjects:");
		for (int i = 0; i < 5; i++) 
		{
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
			add=add+marks[i];
		}
		res=(add/5);
	}
	// Method to display result
	public void displayResult() 
	{
		System.out.println("Student details:");
		System.out.println("Roll Number: " + getRollNumber());
		System.out.println("Name: " + getName());
		System.out.println("Marks:"+res);
	}
}
public class StudentDetails 
{
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student roll number: ");
		int rollNumber = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		// Create an object of MarksDetails class
		MarksDetails student = new MarksDetails(rollNumber, name);
		// Accept marks
		student.acceptMarks();
		// Display result
		student.displayResult();
 }
}
