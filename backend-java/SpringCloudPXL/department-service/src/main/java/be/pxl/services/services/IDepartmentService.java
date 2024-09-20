package be.pxl.services.services;

import be.pxl.services.controller.dtos.ReturnDepWEmp;
import be.pxl.services.domain.Department;
import java.util.List;

public interface IDepartmentService {

    List<Department> getAllDepartments();

    void addDepartment(Department Department);

    Department getDepartmentById(Long id);

    Department getDepartmentByOrganizationId(Long organizationId);

    ReturnDepWEmp getDepartmentByOrgIdAndEmployees(Long organizationId);
}
