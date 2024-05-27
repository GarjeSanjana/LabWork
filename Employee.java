/*Q.1)Write a program that would print the information (name, year of joining, salary, address) 
 * of three employees by creating a class named 'Employee'.The output should be as follows:
Name        Year of joining        Address
Robert      1994                   64C- WallsStreat
Sam         2000                   68D- WallsStreat
John        1999                   26B- WallsStreat
*/
package April25THU.example;

public class Employee {
    private String name;
    private int yearOfJoining;
    private String salary;
    private String address;

    // Constructor
    public Employee(String name, int yearOfJoining, String salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Display method to print employee information
    public void display() {
        System.out.printf("%-10s %-20d %-20s%n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        // Create instances of Employee class
        Employee employee1 = new Employee("Robert", 1994, "$5000", "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, "$6000", "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, "$5500", "26B- WallsStreat");

        // Print the header
        System.out.printf("%-10s %-20s %-20s%n", "Name", "Year of joining", "Address");

        // Display information of each employee
        employee1.display();
        employee2.display();
        employee3.display();
    }
}
