package user.management.userManagement.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import user.management.userManagement.business.Requests.CreateUserRequest;
import user.management.userManagement.business.Responses.GetAllUsersResponse;
import user.management.userManagement.business.Responses.GetByIdUserResponse;
import user.management.userManagement.business.abstracts.UserService;

//annotation - Bilgilendirme
@RestController
@RequestMapping("/api/users") //adresleme
@Controller
@AllArgsConstructor
public class UsersController {
	private UserService userService;
	
	// Bu bize otomatik olarak parametrelere bakip userservice nereden gelmis gidip bakar
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
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
