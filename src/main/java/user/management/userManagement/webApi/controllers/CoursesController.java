package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.Requests.CreateCourseRequest;
import user.management.userManagement.business.Responses.GetAllCoursesResponse;
import user.management.userManagement.business.Responses.GetByIdCourseResponse;
import user.management.userManagement.business.abstracts.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
@Controller
public class CoursesController {
    private CourseService courseService;

    @GetMapping("/getall")
    public List<GetAllCoursesResponse> getAll(){
        return courseService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdCourseResponse getById(@PathVariable int id){
        return courseService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateCourseRequest createCourseRequest) {
        this.courseService.add(createCourseRequest);
    }
}
