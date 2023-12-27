package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.Requests.CreateSchoolRequest;
import user.management.userManagement.business.Responses.GetAllSchoolsResponse;
import user.management.userManagement.business.Responses.GetByIdSchoolResponse;

import java.util.List;

public interface SchoolService {
    List<GetAllSchoolsResponse> getAll();
    GetByIdSchoolResponse getById(int id);
    void add(CreateSchoolRequest createCourseRequest);
}
