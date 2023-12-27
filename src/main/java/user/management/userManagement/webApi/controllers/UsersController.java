package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.DTOs.Requests.Create.CreateUserRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateUserRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllUsersResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdUserResponse;
import user.management.userManagement.business.abstracts.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@Controller
public class UsersController {
	private UserService userService;

	@GetMapping()
	public List<GetAllUsersResponse> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdUserResponse getById(@PathVariable int id){
		return userService.getById(id);
	}
	
	@PostMapping()
	@ResponseStatus(code= HttpStatus.CREATED)
	public void add(@RequestBody() CreateUserRequest createUserRequest) {
		this.userService.add(createUserRequest);
	}

	@PutMapping()
	public void update(@RequestBody UpdateUserRequest updateUserRequest){
		this.userService.update(updateUserRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.userService.delete(id);
	}
}
