package user.management.userManagement.business.DTOs.Requests.Update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCourseRequest {
    private int id;
    private String courseName;
    List<Student> students;
}
