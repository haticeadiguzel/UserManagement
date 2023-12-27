package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.DTOs.Requests.Create.CreateStudentRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateStudentRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllStudentsResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdStudentResponse;
import user.management.userManagement.business.abstracts.StudentService;
import user.management.userManagement.core.utilities.mappers.ModelMapperService;
import user.management.userManagement.dataAccess.abstracts.StudentRepository;
import user.management.userManagement.entities.concretes.Student;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class StudentManager implements StudentService {
    private StudentRepository studentRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllStudentsResponse> getAll() {
        List<Student> students = studentRepository.findAll();
        List<GetAllStudentsResponse> studentsResponses = students.stream()
                .map(student->this.modelMapperService.forResponse().map(student, GetAllStudentsResponse.class))
                .collect(Collectors.toList());
        return studentsResponses;
    }

    @Override
    public GetByIdStudentResponse getById(int id) {
        Student student = this.studentRepository.findById(id).orElseThrow();
        GetByIdStudentResponse response = this.modelMapperService.forResponse().map(student, GetByIdStudentResponse.class);
        return response;
    }

    @Override
    public void add(CreateStudentRequest createStudentRequest) {
        Student student = this.modelMapperService.forRequest().map(createStudentRequest, Student.class);
        this.studentRepository.save(student);
    }

    @Override
    public void update(UpdateStudentRequest updateStudentRequest) {
        Student student = this.modelMapperService.forRequest().map(updateStudentRequest, Student.class);
        this.studentRepository.save(student);
    }

    @Override
    public void delete(int id) {
        this.studentRepository.deleteById(id);
    }
}
