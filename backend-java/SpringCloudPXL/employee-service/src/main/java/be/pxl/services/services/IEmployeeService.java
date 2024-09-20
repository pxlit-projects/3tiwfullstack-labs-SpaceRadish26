package be.pxl.services.services;

import be.pxl.services.domain.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    List<Employee> getEmployeesByDepartmentId(Long departmentId);

    List<Employee> getEmployeesByOrganizationId(Long organizationId);
}
