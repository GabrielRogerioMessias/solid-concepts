package OCP.correct.services;

// Representa um funcionário contratado em tempo integral (CLT).
// Implementa a interface Employee.
public class FullTimeEmployee implements Employee {

    // Salário fixo para o funcionário CLT.
    @Override
    public double calculateSalary() {
        return 3000.0;
    }
}