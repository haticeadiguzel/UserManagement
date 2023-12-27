package user.management.userManagement.business.DTOs.Responses.GetById;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdAddressResponse {
    private String openAddress;
    private Student student;
}
