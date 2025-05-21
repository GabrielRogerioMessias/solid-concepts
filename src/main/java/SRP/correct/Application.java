package SRP.correct;

import SRP.correct.entities.Employee;
import SRP.correct.repositories.EmployeeImpl;
import SRP.correct.repositories.EmployeeRepository;
import SRP.correct.services.EmailService;
import SRP.correct.services.EmployeeService;

public class Application {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeImpl();
        EmailService emailService = new EmailService();
        EmployeeService employeeService = new EmployeeService(employeeRepository, emailService);
        Employee employee = new Employee("Solid Concepts", "solidconcepts@solid.com");
        employeeService.saveNewEmployee(employee);
    }
}
