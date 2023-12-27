package user.management.userManagement.business.DTOs.Responses.GetById;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Student;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdCourseResponse {
    private String courseName;
    List<Student> students;
}
