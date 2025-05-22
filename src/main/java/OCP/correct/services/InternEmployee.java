package OCP.correct.services;

// Representa um estagiário (Intern).
// Também implementa a interface Employee.
public class InternEmployee implements Employee {

    // Salário fixo menor, pois é um estagiário.
    @Override
    public double calculateSalary() {
        return 1000.0;
    }
}