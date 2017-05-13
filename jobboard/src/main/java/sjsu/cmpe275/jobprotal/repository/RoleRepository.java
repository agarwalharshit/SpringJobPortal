package sjsu.cmpe275.jobprotal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sjsu.cmpe275.jobprotal.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
