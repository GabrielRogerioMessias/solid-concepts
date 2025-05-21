package SRP.correct.services;

import SRP.correct.entities.Employee;
import SRP.correct.repositories.EmployeeRepository;

// APLICA O PRINCÍPIO DA RESPONSABILIDADE ÚNICA (SRP)
// Cada classe tem uma única responsabilidade:
// - EmployeeService coordena ações (não faz tudo sozinho)
// - EmailService lida com envio de e-mails
// - EmployeeImpl lida com persistência de dados
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmailService emailService;

    public EmployeeService(EmployeeRepository employeeRepository, EmailService emailService) {
        this.employeeRepository = employeeRepository;
        this.emailService = emailService;
    }

    public void saveNewEmployee(Employee employee) {
        this.employeeRepository.save(employee);
        this.emailService.sendValidationEmail();
    }
}
