package user.management.userManagement.business.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest {
    private String openAddress;
    private Student student;
}
