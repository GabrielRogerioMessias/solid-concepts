package OCP.wrong;

public class OCPWrongApplication {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Employee e1 = new Employee("fulltime", 10.0);
        Employee e2 = new Employee("freelancer", 10.0);
        Employee e3 = new Employee("intern", 10.0);
        System.out.println("fulltime: " + salaryCalculator.calculateSalary(e1));
        System.out.println("freelancer: " + salaryCalculator.calculateSalary(e2));
        System.out.println("intern: " + salaryCalculator.calculateSalary(e3));
    }
}
