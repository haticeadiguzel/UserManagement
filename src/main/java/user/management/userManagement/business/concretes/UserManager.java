package user.management.userManagement.business.concretes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import user.management.userManagement.business.Requests.CreateUserRequest;
import user.management.userManagement.business.Responses.GetAllUsersResponse;
import user.management.userManagement.business.Responses.GetByIdUserResponse;
import user.management.userManagement.business.abstracts.UserService;
import user.management.userManagement.dataAccess.abstracts.UserRepository;
import user.management.userManagement.entities.concretes.User;

@AllArgsConstructor
@Service
public class UserManager implements UserService {
	// Injection - loosly coupled, bu sayede yeni teknolojilere gecmek daha kolay olur
	//Dependency Injection
	private UserRepository userRepository;

	@Override
	public List<GetAllUsersResponse> getAll() {
		List<User> users = userRepository.findAll();
		List<GetAllUsersResponse> usersResponse = new ArrayList<GetAllUsersResponse>();
		
		for (User user : users) {
			GetAllUsersResponse responseItem = new GetAllUsersResponse();
			responseItem.setId(user.getId());
			responseItem.setFirstName(user.getFirstName());
			responseItem.setLastName(user.getLastName());
			responseItem.setEmail(user.getEmail());
			responseItem.setAddress(user.getAddress());
			
			usersResponse.add(responseItem);
		}
		
		return usersResponse;
		
	}

	@Override
	public void add(CreateUserRequest createUserRequest) {
		User user = new User();
		user.setFirstName(createUserRequest.getFirstName());
		user.setLastName(createUserRequest.getLastName());
		user.setEmail(createUserRequest.getEmail());
		user.setAddress(createUserRequest.getAddress());
		user.setPassword(createUserRequest.getPassword());
		
		this.userRepository.save(user);
		
	}

	@Override
	public GetByIdUserResponse getById(int id) {
		User user = this.userRepository.findById(id).orElseThrow();
		
		GetByIdUserResponse getByIdUserResponse = new GetByIdUserResponse();
		getByIdUserResponse.setId(user.getId());
		getByIdUserResponse.setFirstName(user.getFirstName());
		getByIdUserResponse.setLastName(user.getLastName());
		getByIdUserResponse.setEmail(user.getEmail());
		getByIdUserResponse.setAddress(user.getAddress());
		
		return getByIdUserResponse;
	}

	
}
