package ru.andrewborchenko.spring.mvc_hibernate_aop.dao;

import org.springframework.stereotype.Repository;
import ru.andrewborchenko.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
