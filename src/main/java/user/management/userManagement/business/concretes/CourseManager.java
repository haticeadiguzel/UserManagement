package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.DTOs.Requests.Create.CreateCourseRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateCourseRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllCoursesResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdCourseResponse;
import user.management.userManagement.business.abstracts.CourseService;
import user.management.userManagement.core.utilities.mappers.ModelMapperService;
import user.management.userManagement.dataAccess.abstracts.CourseRepository;
import user.management.userManagement.entities.concretes.Course;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CourseManager implements CourseService {
    private CourseRepository courseRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllCoursesResponse> getAll() {
        List<Course> courses = courseRepository.findAll();
        List<GetAllCoursesResponse> coursesResponse = courses.stream()
                .map(course->this.modelMapperService.forResponse().map(course, GetAllCoursesResponse.class))
                .collect(Collectors.toList());
        return coursesResponse;
    }

    @Override
    public GetByIdCourseResponse getById(int id) {
        Course course = this.courseRepository.findById(id).orElseThrow();
        GetByIdCourseResponse response = this.modelMapperService.forResponse().map(course, GetByIdCourseResponse.class);
        return response;
    }

    @Override
    public void add(CreateCourseRequest createCourseRequest) {
        Course course = this.modelMapperService.forRequest().map(createCourseRequest, Course.class);
        this.courseRepository.save(course);
    }

    @Override
    public void update(UpdateCourseRequest updateCourseRequest) {
        Course course = this.modelMapperService.forRequest().map(updateCourseRequest, Course.class);
        this.courseRepository.save(course);
    }

    @Override
    public void delete(int id) {
        this.courseRepository.deleteById(id);
    }
}
