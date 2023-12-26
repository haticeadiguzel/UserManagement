package user.management.userManagement.business.abstracts;

import java.util.List;

import user.management.userManagement.business.Requests.CreateUserRequest;
import user.management.userManagement.business.Responses.GetAllUsersResponse;
import user.management.userManagement.business.Responses.GetByIdUserResponse;

public interface UserService {
	List<GetAllUsersResponse> getAll();
	GetByIdUserResponse getById(int id);
	void add(CreateUserRequest createUserRequest);
}
