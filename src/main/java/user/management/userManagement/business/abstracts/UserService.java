package user.management.userManagement.business.abstracts;

import java.util.List;

import user.management.userManagement.entities.concretes.User;

public interface UserService {
	List<User> getAll();

}
