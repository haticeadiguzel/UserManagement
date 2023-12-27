package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.DTOs.Requests.Create.CreateCourseRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateCourseRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllCoursesResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdCourseResponse;
import user.management.userManagement.business.abstracts.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
@Controller
public class CoursesController {
    private CourseService courseService;

    @GetMapping()
    public List<GetAllCoursesResponse> getAll(){
        return courseService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdCourseResponse getById(@PathVariable int id){
        return courseService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreateCourseRequest createCourseRequest) {
        this.courseService.add(createCourseRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateCourseRequest updateCourseRequest){
        this.courseService.update(updateCourseRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.courseService.delete(id);
    }
}
