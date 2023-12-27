package user.management.userManagement.business.DTOs.Requests.Create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.management.userManagement.entities.concretes.Address;
import user.management.userManagement.entities.concretes.School;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentRequest {
    @NotNull //java constrains list
    @NotBlank
    private String firstName;
    private String lastName;
    private String grade;
    private String studentNo;
    private School school;
    private Address address;
}
