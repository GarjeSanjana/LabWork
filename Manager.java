package April25THU.example;

//Manager subclass
public class Manager extends Person {
	private String department;

	// Constructor
	public Manager(int id, String name, double salary, String department) {
		super(id, name, salary);
		this.department = department;
	}
	// Overriding abstract method from Person class
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Manager Details:");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: $" + salary);
		System.out.println("Department: " + department);
	}
	
}

