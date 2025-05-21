package SRP.wrong;

import SRP.wrong.entities.Employee;
import SRP.wrong.services.EmployeeService;

public class Application {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee employee = new Employee("Wrong Example", "wrong@example.com");
        employeeService.saveNewEmployee(employee);
        employeeService.sendEmailValidation();
    }
}
