package user.management.userManagement.business.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Address;
import user.management.userManagement.entities.concretes.Course;
import user.management.userManagement.entities.concretes.School;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdStudentResponse {
    private String firstName;
    private String lastName;
    private String grade;
    private Integer studentNo;
    private School school;
    private Address address;
    private List<Course> courses;
}
