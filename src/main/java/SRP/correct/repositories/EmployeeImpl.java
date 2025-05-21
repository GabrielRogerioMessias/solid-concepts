package SRP.correct.repositories;

import SRP.correct.entities.Employee;

public class EmployeeImpl implements EmployeeRepository {
    @Override
    public void save(Employee employee) {
        System.out.println("the new employee has been saved in the database.");
    }
}
