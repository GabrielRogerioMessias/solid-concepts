package OCP.wrong;
    public class SalaryCalculator {
        public double calculateSalary(Employee employee) {
            if (employee.getType().equals("fulltime")) {
                return 3000.0;
            } else if (employee.getType().equals("freelancer")) {
                return employee.getHoursWorked() * 50.0;
            } else if (employee.getType().equals("intern")) {
                return 1000.0;
            } else {
                throw new IllegalArgumentException("Tipo de funcionário desconhecido");
            }
        }
    }


