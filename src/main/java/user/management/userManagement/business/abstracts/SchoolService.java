package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.DTOs.Requests.Create.CreateSchoolRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateSchoolRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllSchoolsResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdSchoolResponse;

import java.util.List;

public interface SchoolService {
    List<GetAllSchoolsResponse> getAll();
    GetByIdSchoolResponse getById(int id);
    void add(CreateSchoolRequest createCourseRequest);
    void update(UpdateSchoolRequest updateSchoolRequest);
    void delete(int id);
}
