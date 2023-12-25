package user.management.userManagement.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.management.userManagement.business.abstracts.UserService;
import user.management.userManagement.dataAccess.abstracts.UserRepository;
import user.management.userManagement.entities.concretes.User;

@Service // Bir business nesnesi
public class UserManager implements UserService {
	// Injection - loosly coupled, bu sayede yeni teknolojilere gecmek daha kolay olur
	private UserRepository userRepository;
	
	@Autowired
	public UserManager(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAll() {
		// Business Rules
		return userRepository.getAll();
	}
	
}
