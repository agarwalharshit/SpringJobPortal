package sjsu.cmpe275.jobprotal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sjsu.cmpe275.jobprotal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
