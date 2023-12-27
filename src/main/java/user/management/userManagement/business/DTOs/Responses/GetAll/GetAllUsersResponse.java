package user.management.userManagement.business.DTOs.Responses.GetAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
	private String firstName;
	private String lastName;
	private String email;
	private String address;
}
