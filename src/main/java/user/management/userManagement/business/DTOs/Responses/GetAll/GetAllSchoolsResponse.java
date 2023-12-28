package user.management.userManagement.business.DTOs.Responses.GetAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.School;
import user.management.userManagement.entities.concretes.TypeSchool;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSchoolsResponse {
    private TypeSchool schoolName;
}
