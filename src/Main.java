public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 50000, 10000);
        Programmer programmer = new Programmer("Alice", 60000, 10);

        System.out.println("Manager Information:");
        manager.displayInfo();

        System.out.println("\nProgrammer Information:");
        programmer.displayInfo();
    }
}