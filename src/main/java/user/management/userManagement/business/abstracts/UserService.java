package user.management.userManagement.business.abstracts;

import java.util.List;

import user.management.userManagement.business.DTOs.Requests.Create.CreateUserRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateUserRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllUsersResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdUserResponse;

public interface UserService {
	List<GetAllUsersResponse> getAll();
	GetByIdUserResponse getById(int id);
	void add(CreateUserRequest createUserRequest);
	void update(UpdateUserRequest updateUserRequest);
	void delete(int id);
}
