package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.Requests.CreateCourseRequest;
import user.management.userManagement.business.Responses.GetAllCoursesResponse;
import user.management.userManagement.business.Responses.GetByIdCourseResponse;

import java.util.List;

public interface CourseService {
    List<GetAllCoursesResponse> getAll();
    GetByIdCourseResponse getById(int id);
    void add(CreateCourseRequest createCourseRequest);
}
