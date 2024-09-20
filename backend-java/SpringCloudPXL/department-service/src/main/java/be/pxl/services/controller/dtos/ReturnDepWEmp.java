package be.pxl.services.controller.dtos;


import be.pxl.services.domain.Department;
import be.pxl.services.domain.Employee;
import lombok.Getter;

import java.util.List;

@Getter
public record ReturnDepWEmp(List<Employee> employees, Department department) {


}
