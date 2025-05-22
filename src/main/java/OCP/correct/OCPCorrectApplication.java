package OCP.correct;

import OCP.correct.services.FreelancerEmployee;
import OCP.correct.services.FullTimeEmployee;
import OCP.correct.services.InternEmployee;

public class OCPCorrectApplication {
    public static void main(String[] args) {
        // Criação de instâncias para cada tipo de funcionário
        FreelancerEmployee freelancerEmployee = new FreelancerEmployee(10);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        InternEmployee internEmployee = new InternEmployee();

        // Exibe o salário de cada funcionário usando polimorfismo.
        System.out.println("fulltime: " + fullTimeEmployee.calculateSalary());
        System.out.println("freelancer: " + freelancerEmployee.calculateSalary());
        System.out.println("intern: " + internEmployee.calculateSalary());
    }
}
