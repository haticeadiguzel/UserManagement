package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.DTOs.Requests.Create.CreateAddressRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateAddressRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllAddressesResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdAddressResponse;

import java.util.List;

public interface AddressService {
    List<GetAllAddressesResponse> getAll();
    GetByIdAddressResponse getById(int id);
    void add(CreateAddressRequest createAddressRequest);
    void update(UpdateAddressRequest updateAddressRequest);
    void delete(int id);
}
