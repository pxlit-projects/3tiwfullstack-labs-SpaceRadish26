package be.pxl.services.repository;

import be.pxl.services.domain.Organization;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long>   {


    Organization findByOrganizationId(Long organizationId);

    @EntityGraph(attributePaths = "departments")
    Organization findByIdWithDeps(Long id);


    @EntityGraph(attributePaths = {"departments", "departments.employees"})
    Organization findByIdWithDepartmentsAndEmployees(Long id);


    @EntityGraph(attributePaths = "departments.employees")
    Organization findByIdWithEmployees(Long id);
}
