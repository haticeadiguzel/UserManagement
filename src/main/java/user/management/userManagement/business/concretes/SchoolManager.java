package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.DTOs.Requests.Create.CreateSchoolRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateSchoolRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllSchoolsResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdSchoolResponse;
import user.management.userManagement.business.abstracts.SchoolService;
import user.management.userManagement.core.utilities.mappers.ModelMapperService;
import user.management.userManagement.dataAccess.abstracts.SchoolRepository;
import user.management.userManagement.entities.concretes.School;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SchoolManager implements SchoolService {
    private SchoolRepository schoolRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllSchoolsResponse> getAll() {
        List<School> schools = schoolRepository.findAll();
        List<GetAllSchoolsResponse> schoolsResponse = schools.stream()
                .map(school->this.modelMapperService.forResponse().map(school, GetAllSchoolsResponse.class))
                .collect(Collectors.toList());
        return schoolsResponse;
    }

    @Override
    public GetByIdSchoolResponse getById(int id) {
        School school = this.schoolRepository.findById(id).orElseThrow();
        GetByIdSchoolResponse response = this.modelMapperService.forResponse().map(school, GetByIdSchoolResponse.class);
        return response;
    }

    @Override
    public void add(CreateSchoolRequest createSchoolRequest) {
        School school = this.modelMapperService.forRequest().map(createSchoolRequest, School.class);
        this.schoolRepository.save(school);
    }

    @Override
    public void update(UpdateSchoolRequest updateSchoolRequest) {
        School school = this.modelMapperService.forRequest().map(updateSchoolRequest, School.class);
        this.schoolRepository.save(school);
    }

    @Override
    public void delete(int id) {
        this.schoolRepository.deleteById(id);
    }
}
