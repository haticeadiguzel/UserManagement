package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.DTOs.Requests.Create.CreateStudentRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateStudentRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllStudentsResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdStudentResponse;
import user.management.userManagement.business.abstracts.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
@Controller
public class StudentsController {
    private StudentService studentService;

    @GetMapping()
    public List<GetAllStudentsResponse> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdStudentResponse getById(@PathVariable int id){
        return studentService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreateStudentRequest createStudentRequest) {
        this.studentService.add(createStudentRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateStudentRequest updateStudentRequest){
        this.studentService.update(updateStudentRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.studentService.delete(id);
    }
}
