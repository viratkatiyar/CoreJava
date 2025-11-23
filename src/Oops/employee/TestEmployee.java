package ClassesAndObjects.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Virat", 21, 900000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Virat Don");
        System.out.println(emp.getEmployeeDetails());
    }
}
