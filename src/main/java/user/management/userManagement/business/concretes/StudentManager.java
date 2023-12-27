package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.Requests.CreateStudentRequest;
import user.management.userManagement.business.Responses.GetAllStudentsResponse;
import user.management.userManagement.business.Responses.GetByIdStudentResponse;
import user.management.userManagement.business.abstracts.StudentService;
import user.management.userManagement.dataAccess.abstracts.StudentRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentManager implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public List<GetAllStudentsResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdStudentResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateStudentRequest createStudentRequest) {

    }
}
