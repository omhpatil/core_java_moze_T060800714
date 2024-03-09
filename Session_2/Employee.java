package Session_2;

public class Employee {

    private int empId;
    private String empName;
    private float empSalary;

    public void setEmployee() {
        empId = 111;
        empName = "Rahul"; // Enclose in double quotes
        empSalary = 10000.99f; // Use 'f' suffix for float literals
    }

    public void displayEmployee() {
        System.out.println("Employee = [" + empId + " " + empName + " " + empSalary + "]");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.empId + " " + e.empName + " " + e.empSalary);
        e.setEmployee(); // Correct method name
        e.displayEmployee();
    }
}