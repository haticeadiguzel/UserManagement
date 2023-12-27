package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.Requests.CreateCourseRequest;
import user.management.userManagement.business.Responses.GetAllCoursesResponse;
import user.management.userManagement.business.Responses.GetByIdCourseResponse;
import user.management.userManagement.business.abstracts.CourseService;
import user.management.userManagement.dataAccess.abstracts.CourseRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseManager implements CourseService {
    private CourseRepository courseRepository;

    @Override
    public List<GetAllCoursesResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdCourseResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateCourseRequest createCourseRequest) {

    }
}
