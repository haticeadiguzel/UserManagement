package user.management.userManagement.business.DTOs.Requests.Create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest {
    private String openAddress;
}
