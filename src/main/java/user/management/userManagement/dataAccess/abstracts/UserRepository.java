package user.management.userManagement.dataAccess.abstracts;

import java.util.List;

import user.management.userManagement.entities.concretes.User;

public interface UserRepository {
	List<User> getAll();	
}
