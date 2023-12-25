package user.management.userManagement.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.management.userManagement.business.abstracts.UserService;
import user.management.userManagement.entities.concretes.User;

//annotation - Bilgilendirme
@RestController
@RequestMapping("/api/users") //adresleme
public class UsersController {
	private UserService userService;
	
	// Bu bize otomatik olarak parametrelere bakip userservice nereden gelmis gidip bakar
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return userService.getAll();
	}
}
