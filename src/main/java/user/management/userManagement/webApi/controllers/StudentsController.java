package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.Requests.CreateStudentRequest;
import user.management.userManagement.business.Responses.GetAllStudentsResponse;
import user.management.userManagement.business.Responses.GetByIdStudentResponse;
import user.management.userManagement.business.abstracts.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
@Controller
public class StudentsController {
    private StudentService studentService;

    @GetMapping("/getall")
    public List<GetAllStudentsResponse> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdStudentResponse getById(@PathVariable int id){
        return studentService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateStudentRequest createStudentRequest) {
        this.studentService.add(createStudentRequest);
    }
}
