package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.DTOs.Requests.Create.CreateCourseRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateCourseRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllCoursesResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdCourseResponse;

import java.util.List;

public interface CourseService {
    List<GetAllCoursesResponse> getAll();
    GetByIdCourseResponse getById(int id);
    void add(CreateCourseRequest createCourseRequest);
    void update(UpdateCourseRequest updateCourseRequest);
    void delete(int id);
}
