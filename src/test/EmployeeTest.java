import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testManagerCalculateSalary() {
        Manager manager = new Manager("John", 50000, 10000);
        assertEquals(60000, manager.calculateSalary());
    }

    @Test
    public void testProgrammerCalculateSalary() {
        Programmer programmer = new Programmer("Alice", 40000, 10);
        assertEquals(40200, programmer.calculateSalary());
    }
}