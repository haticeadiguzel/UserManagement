package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.Requests.CreateSchoolRequest;
import user.management.userManagement.business.Responses.GetAllSchoolsResponse;
import user.management.userManagement.business.Responses.GetByIdSchoolResponse;
import user.management.userManagement.business.abstracts.SchoolService;
import user.management.userManagement.dataAccess.abstracts.SchoolRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class SchoolManager implements SchoolService {
    private SchoolRepository schoolRepository;

    @Override
    public List<GetAllSchoolsResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdSchoolResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateSchoolRequest createCourseRequest) {

    }
}
