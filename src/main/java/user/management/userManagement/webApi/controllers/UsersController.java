package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.Requests.CreateUserRequest;
import user.management.userManagement.business.Responses.GetAllUsersResponse;
import user.management.userManagement.business.Responses.GetByIdUserResponse;
import user.management.userManagement.business.abstracts.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@Controller
public class UsersController {
	private UserService userService;

	@GetMapping("/getall")
	public List<GetAllUsersResponse> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public GetByIdUserResponse getById(@PathVariable int id){
		return userService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateUserRequest createUserRequest) {
		this.userService.add(createUserRequest);
	}
}
