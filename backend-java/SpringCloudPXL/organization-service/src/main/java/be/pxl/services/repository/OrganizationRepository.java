package be.pxl.services.repository;

import be.pxl.services.domain.Organization;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  OrganizationRepository extends JpaRepository<Organization, Long>   {


    Organization findByOrganizationId(Long organizationId);


}
