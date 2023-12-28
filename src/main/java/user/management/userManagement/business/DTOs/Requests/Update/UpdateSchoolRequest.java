package user.management.userManagement.business.DTOs.Requests.Update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.TypeSchool;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSchoolRequest {
    private int id;
    private TypeSchool schoolName;
}
