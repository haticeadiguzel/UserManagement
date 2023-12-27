package user.management.userManagement;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

	//Bir yer model mapper isterse bu metot calisacak. Bean gorunce bu bir nesne controctorda lazim olcak ioc ekliyim dicek.
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
