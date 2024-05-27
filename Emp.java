package April25THU.example;

//Emp subclass
public class Emp extends Person {
	private String position;

	// Constructor
	public Emp(int id, String name, double salary, String position) {
		super(id, name, salary);
		this.position = position;
	}

	// Overriding abstract method from Person class
	@Override
	public void displayDetails(){
		// TODO Auto-generated method stub
		System.out.println("Employee Details:");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: $" + salary);
		System.out.println("Position: " + position);
	}
}
