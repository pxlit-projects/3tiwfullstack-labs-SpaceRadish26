package be.pxl.services.controller;


import be.pxl.services.controller.dtos.ReturnDepWEmp;
import be.pxl.services.services.DepartmentService;
import be.pxl.services.services.IDepartmentService;
import be.pxl.services.domain.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Department")
@RequiredArgsConstructor
public class DepartmentController {


    private final IDepartmentService departmentService;

    @GetMapping("/organization/{organizationId}")
    public ResponseEntity<Department> findByOrganization(@PathVariable Long organizationId) {
        return new ResponseEntity<>(departmentService.getDepartmentByOrganizationId(organizationId), HttpStatus.OK);
    }
    @GetMapping("/organization/{organizationId}/with-employees")
    public ResponseEntity<ReturnDepWEmp> findByOrganizationWithEmp(@PathVariable Long organizationId) {
        return new ResponseEntity<>(departmentService.getDepartmentByOrgIdAndEmployees(organizationId), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id) {
        return new ResponseEntity<>(departmentService.getDepartmentById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Department>> getDepartments() {
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addDepartment(@RequestBody Department Department) {
        departmentService.addDepartment(Department);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
