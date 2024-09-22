package be.pxl.services.controller;

import be.pxl.services.domain.Organization;
import be.pxl.services.services.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/Organization")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;

    @GetMapping("/{id}")
    public ResponseEntity<Organization> findById(@PathVariable Long id) {
       Organization organization = (organizationService.getOrganizationById(id));
        return ResponseEntity.ok(organization);
    }

    @GetMapping("/{id}/with-departments")
    public ResponseEntity<Organization> findByIdWithDepartments(@PathVariable Long id) {
        Organization organization = (organizationService.getOrganizationByIdWithDepartments(id));
        return ResponseEntity.ok(organization);
    }

    @GetMapping("/{id}/with-departments-and-employees")
    public ResponseEntity<Organization> findByIdWithDepartmentsAndEmployees(@PathVariable Long id) {
       Organization organization = (organizationService.getOrganizationByIdWithDepartmentsAndEmployees(id));
        return ResponseEntity.ok(organization);
    }

    @GetMapping("/{id}/with-employees")
    public ResponseEntity<Organization> findByIdWithEmployees(@PathVariable Long id) {
        Organization organization = (organizationService.getOrganizationByIdWithEmployees(id));
        return ResponseEntity.ok(organization);
    }

}
