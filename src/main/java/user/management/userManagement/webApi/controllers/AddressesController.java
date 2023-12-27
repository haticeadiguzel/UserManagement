package user.management.userManagement.webApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.management.userManagement.business.DTOs.Requests.Create.CreateAddressRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateAddressRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllAddressesResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdAddressResponse;
import user.management.userManagement.business.abstracts.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@AllArgsConstructor
@Controller
public class AddressesController {
    private AddressService addressService;

    @GetMapping()
    public List<GetAllAddressesResponse> getAll(){
        return addressService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdAddressResponse getById(@PathVariable int id){
        return addressService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreateAddressRequest createAddressRequest) {
        this.addressService.add(createAddressRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateAddressRequest updateAddressRequest){
        this.addressService.update(updateAddressRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.addressService.delete(id);
    }
}
