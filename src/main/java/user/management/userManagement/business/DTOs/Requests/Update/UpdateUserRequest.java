package user.management.userManagement.business.DTOs.Requests.Update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String password;
}
