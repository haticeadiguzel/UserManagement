package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.DTOs.Requests.Create.CreateStudentRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateStudentRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllStudentsResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdStudentResponse;

import java.util.List;

public interface StudentService {
    List<GetAllStudentsResponse> getAll();
    GetByIdStudentResponse getById(int id);
    void add(CreateStudentRequest createStudentRequest);
    void update(UpdateStudentRequest updateStudentRequest);
    void delete(int id);
}
