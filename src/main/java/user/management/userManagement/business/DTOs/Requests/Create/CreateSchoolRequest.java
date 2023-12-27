package user.management.userManagement.business.DTOs.Requests.Create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSchoolRequest {
    private String schoolName;
    List<Student> students;
}
