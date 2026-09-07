public class Employee {
    private int empId;
    private String name;
    private double basicSalary;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displaySalaryDetails() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        System.out.println("--- Employee Salary Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA (20%): ₹" + hra);
        System.out.println("DA (10%): ₹" + da);
        System.out.println("Gross Salary: ₹" + grossSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Priya Patel", 50000.00);
        emp.displaySalaryDetails();
    }
}