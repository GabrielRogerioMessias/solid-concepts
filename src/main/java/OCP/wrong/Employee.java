package OCP.wrong;

public class Employee {
    private String type;
    private Double hoursWorked;

    public Employee() {
    }

    public Employee(String type, Double hoursWorked) {
        this.type = type;
        this.hoursWorked = hoursWorked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
