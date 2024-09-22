package be.pxl.services.services;

import be.pxl.services.domain.Organization;
import be.pxl.services.repository.OrganizationRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService implements IOrganizationService{

    private final OrganizationRepository organizationRepository;


    @Override
    public Organization getOrganizationById(Long id) {
        return organizationRepository.findByOrganizationId(id);
    }

    @Override
    public Organization getOrganizationByIdWithDepartments(Long id) {
        return organizationRepository.findByIdWithDeps(id);
    }

    @Override
    public Organization getOrganizationByIdWithDepartmentsAndEmployees(Long id) {
        return organizationRepository.findByIdWithDepartmentsAndEmployees(id);
    }

    @Override
    public Organization getOrganizationByIdWithEmployees(Long id) {
        return organizationRepository.findByIdWithEmployees(id);
    }
}
