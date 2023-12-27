package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.DTOs.Requests.Create.CreateSchoolRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateSchoolRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllSchoolsResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdSchoolResponse;
import user.management.userManagement.business.abstracts.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@AllArgsConstructor
@Controller
public class SchoolsController {
    private SchoolService schoolService;

    @GetMapping()
    public List<GetAllSchoolsResponse> getAll(){
        return schoolService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdSchoolResponse getById(@PathVariable int id){
        return schoolService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreateSchoolRequest createSchoolRequest) {
        this.schoolService.add(createSchoolRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateSchoolRequest updateSchoolRequest){
        this.schoolService.update(updateSchoolRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.schoolService.delete(id);
    }
}
