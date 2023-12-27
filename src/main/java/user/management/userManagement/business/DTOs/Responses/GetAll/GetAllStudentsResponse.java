package user.management.userManagement.business.DTOs.Responses.GetAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Course;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllStudentsResponse {
    private String firstName;
    private String lastName;
    private String grade;
    private String studentNo;
    private String schoolName;
    private String openAddress;
    private List<Course> courses;
}
