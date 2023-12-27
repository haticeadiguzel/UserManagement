package user.management.userManagement.business.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdUserResponse {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
}
