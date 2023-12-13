public class Programmer extends Employee {
    private int overtimeHours;

    public Programmer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        // Assuming an hourly rate for overtime
        double overtimePay = 20.0 * overtimeHours;
        return baseSalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
