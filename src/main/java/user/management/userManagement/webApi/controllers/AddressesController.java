package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.Requests.CreateAddressRequest;
import user.management.userManagement.business.Responses.GetAllAddressesResponse;
import user.management.userManagement.business.Responses.GetByIdAddressResponse;
import user.management.userManagement.business.abstracts.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@AllArgsConstructor
@Controller
public class AddressesController {
    private AddressService addressService;

    @GetMapping("/getall")
    public List<GetAllAddressesResponse> getAll(){
        return addressService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdAddressResponse getById(@PathVariable int id){
        return addressService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateAddressRequest createAddressRequest) {
        this.addressService.add(createAddressRequest);
    }
}
