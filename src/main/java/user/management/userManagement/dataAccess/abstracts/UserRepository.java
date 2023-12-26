package user.management.userManagement.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import user.management.userManagement.entities.concretes.User;

public interface UserRepository extends JpaRepository<User, Integer> {
		
}
