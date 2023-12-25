package user.management.userManagement.business.concretes;

import java.util.List;

import user.management.userManagement.business.abstracts.UserService;
import user.management.userManagement.dataAccess.abstracts.UserRepository;
import user.management.userManagement.entities.concretes.User;

public class UserManager implements UserService {
	// Injection - loosly coupled, bu sayede yeni teknolojilere gecmek daha kolay olur
	private UserRepository userRepository;
	
	public UserManager(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAll() {
		// Business Rules
		return userRepository.getAll();
	}
	
}
