package user.management.userManagement.business.DTOs.Requests.Update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAddressRequest {
    private int id;
    private String openAddress;
    private Student student;
}
