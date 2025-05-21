package SRP.wrong.services;

import SRP.wrong.entities.Employee;
// VIOLA O PRINCÍPIO DA RESPONSABILIDADE ÚNICA (SRP)
// Esta classe possui mais de uma responsabilidade:
// - salvar funcionários no banco de dados
// - enviar e-mail de verificação
// Se a forma de enviar e-mail mudar, essa classe precisará ser alterada
// Se a forma de salvar dados mudar, ela também precisará ser alterada

public class EmployeeService {
    // Responsabilidade 1: salvar dados
    public void saveNewEmployee(Employee employee) {
        System.out.println("the new employee has been saved in the database.");
    }

    // Responsabilidade 2: envio de e-mail
    public void sendEmailValidation() {
        System.out.println("Sending verification e-mail...");
    }
}
