package user.management.userManagement.business.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAddressesResponse {
    private String openAddress;
    private Student student;
}
