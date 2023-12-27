package user.management.userManagement.business.DTOs.Responses.GetById;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdAddressResponse {
    private String openAddress;
    private String firstName;
    private String lastName;
}
