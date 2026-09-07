class BaseEmployee {
    protected String name;
    protected double salary;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + salary);
    }
}

class Manager extends BaseEmployee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Compensation: ₹" + (salary + bonus));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        BaseEmployee emp = new BaseEmployee("Anil Sharma", 45000);
        Manager mgr = new Manager("Vikram Mehta", 80000, 25000);

        System.out.println("--- Employee Info ---");
        emp.displayDetails();

        System.out.println("\n--- Manager Info ---");
        mgr.displayDetails();
    }
}
