package be.pxl.services.services;


import be.pxl.services.domain.Organization;

import java.util.List;

public interface IOrganizationService {

    Organization getOrganizationById(Long id);
    Organization getOrganizationByIdWithDepartments(Long id);
    Organization getOrganizationByIdWithDepartmentsAndEmployees(Long id);
    Organization getOrganizationByIdWithEmployees(Long id);

}
