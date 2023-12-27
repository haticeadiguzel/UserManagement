package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.Requests.CreateSchoolRequest;
import user.management.userManagement.business.Responses.GetAllSchoolsResponse;
import user.management.userManagement.business.Responses.GetByIdSchoolResponse;
import user.management.userManagement.business.abstracts.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@AllArgsConstructor
@Controller
public class SchoolsController {
    private SchoolService schoolService;

    @GetMapping("/getall")
    public List<GetAllSchoolsResponse> getAll(){
        return schoolService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdSchoolResponse getById(@PathVariable int id){
        return schoolService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateSchoolRequest createSchoolRequest) {
        this.schoolService.add(createSchoolRequest);
    }
}
