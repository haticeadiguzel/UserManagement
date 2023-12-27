package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.Requests.CreateStudentRequest;
import user.management.userManagement.business.Responses.GetAllStudentsResponse;
import user.management.userManagement.business.Responses.GetByIdStudentResponse;

import java.util.List;

public interface StudentService {
    List<GetAllStudentsResponse> getAll();
    GetByIdStudentResponse getById(int id);
    void add(CreateStudentRequest createStudentRequest);
}
