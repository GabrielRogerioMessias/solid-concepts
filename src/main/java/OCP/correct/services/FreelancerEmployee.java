package OCP.correct.services;

// Classe que representa um funcionário freelancer.
// Implementa a interface Employee, ou seja, é um tipo de "Employee".
public class FreelancerEmployee implements Employee {
    private final double workedHours; // Armazena as horas trabalhadas do freelancer.

    // Construtor que recebe a quantidade de horas trabalhadas.
    public FreelancerEmployee(double workedHours) {
        this.workedHours = workedHours;
    }

    // Implementação do método da interface.
    // Retorna o salário com base nas horas trabalhadas e valor fixo por hora.
    @Override
    public double calculateSalary() {
        return this.workedHours * 50.0; // Valor por hora: R$50
    }
}