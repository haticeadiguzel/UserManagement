package user.management.userManagement.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import user.management.userManagement.dataAccess.abstracts.UserRepository;
import user.management.userManagement.entities.concretes.User;

public class InMemoryUserRepository implements UserRepository{

	List<User> users;
	
	public InMemoryUserRepository() {
		users = new ArrayList<User>();
		users.add(new User(1, "Hatice", "Adiguzel", "adiguzell.hatice@gmail.com", "Altindag/Ankara", "180115"));
		users.add(new User(2, "Aysen", "Tamer", "tamerr.aysen@gmail.com", "Altindag/Ankara", "180115"));
		users.add(new User(3, "Meryem", "Ozdemir", "ozdemir.meryem@gmail.com", "Altindag/Ankara", "180115"));
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
