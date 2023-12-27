package user.management.userManagement.business.DTOs.Requests.Update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSchoolRequest {
    private int id;
    private String schoolName;
    List<Student> students;
}
