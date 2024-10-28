package be.pxl.services.controller.dtos;


import be.pxl.services.domain.Department;
import be.pxl.services.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ReturnDepWEmp {
    private List<Employee> employees;
    private Department department;

}
