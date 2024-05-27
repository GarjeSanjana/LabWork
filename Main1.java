/*Q.2)WAP to implement abstract methods for class person(id,name,salary) and subclass manager and Employee.
(add your own attributes of choice)
*/
package April25THU.example;

//Main class
public class Main1 {
 public static void main(String[] args) {
	 // TODO Auto-generated method stub
     // Create Manager object
     Manager m = new Manager(1, "Rakesh", 80000, "Finance");

     // Create Employee object
     Emp e = new Emp(2, "Radhika", 50000, "Developer");

     // Display details
     m.displayDetails();
     System.out.println("------------------------");
     e.displayDetails();
 }
}
