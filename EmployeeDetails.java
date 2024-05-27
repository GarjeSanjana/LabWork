//Q.4)Create bean for Employee with fields(eid,ename,esalary).
package April08MON.example;
class Employee 
{
    private int eid;
    private String ename;
    private double esalary;
    // Constructor
    public Employee(int eid, String ename, double esalary) 
    {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }
    // Getter and setter methods for eid
    public int getEid() 
    {
        return eid;
    }
    public void setEid(int eid) 
    {
        this.eid = eid;
    }
    // Getter and setter methods for ename
    public String getEname() 
    {
        return ename;
    }
    public void setEname(String ename) 
    {
        this.ename = ename;
    }
    // Getter and setter methods for esalary
    public double getEsalary() 
    {
        return esalary;
    }
    public void setEsalary(double esalary) 
    {
        this.esalary = esalary;
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "Sanjana Garje", 50000.0);
        // Printing employee details
        System.out.println("Employee ID: " + employee.getEid());
        System.out.println("Employee Name: " + employee.getEname());
        System.out.println("Employee Salary: " + employee.getEsalary());
    }
}
