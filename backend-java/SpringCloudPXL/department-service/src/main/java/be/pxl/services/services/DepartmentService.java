package be.pxl.services.services;

import be.pxl.services.controller.dtos.ReturnDepWEmp;
import be.pxl.services.domain.Department;
import be.pxl.services.domain.Employee;
import be.pxl.services.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentService {


    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void addDepartment(Department Department) {
        departmentRepository.save(Department);
    }


    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }


    @Override
    public Department getDepartmentByOrganizationId(Long organizationId) {
        return departmentRepository.findByOrganizationId(organizationId);
    }

    @Override
    public ReturnDepWEmp getDepartmentByOrgIdAndEmployees(Long organizationId) {
        Department department = departmentRepository.findByOrganizationId(organizationId);

        ReturnDepWEmp returnDepWEmp = new ReturnDepWEmp();
    }
}
