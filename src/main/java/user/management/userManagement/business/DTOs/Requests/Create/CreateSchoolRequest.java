package user.management.userManagement.business.DTOs.Requests.Create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.TypeSchool;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSchoolRequest {
    private TypeSchool schoolName;
}
