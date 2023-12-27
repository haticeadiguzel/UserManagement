package user.management.userManagement.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import user.management.userManagement.business.DTOs.Requests.Create.CreateUserRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateUserRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllUsersResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdUserResponse;
import user.management.userManagement.business.abstracts.UserService;
import user.management.userManagement.core.utilities.mappers.ModelMapperService;
import user.management.userManagement.dataAccess.abstracts.UserRepository;
import user.management.userManagement.entities.concretes.User;

@AllArgsConstructor
@Service
public class UserManager implements UserService {
	private UserRepository userRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllUsersResponse> getAll() {
		List<User> users = userRepository.findAll();
		//stream elimizde bir liste varsa tek tek dolasmamizi saglar.
		List<GetAllUsersResponse> usersResponse = users.stream()
				.map(user->this.modelMapperService.forResponse().map(user, GetAllUsersResponse.class))
				.collect(Collectors.toList());
		return usersResponse;
	}

	@Override
	public GetByIdUserResponse getById(int id) {
		User user = this.userRepository.findById(id).orElseThrow();
		GetByIdUserResponse response = this.modelMapperService.forResponse().map(user, GetByIdUserResponse.class);
		return response;
	}

	@Override
	public void add(CreateUserRequest createUserRequest) {
		// Model mapper arka planda user new'liyor.
		User user = this.modelMapperService.forRequest().map(createUserRequest, User.class);
		this.userRepository.save(user);
	}

	@Override
	public void update(UpdateUserRequest updateUserRequest) {
		//add ile ayni fakat burda id oldugu icin guncelleme yapar
		User user = this.modelMapperService.forRequest().map(updateUserRequest, User.class);
		this.userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		this.userRepository.deleteById(id);
	}
}
