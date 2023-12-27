package user.management.userManagement.business.abstracts;

import user.management.userManagement.business.Requests.CreateAddressRequest;
import user.management.userManagement.business.Responses.GetAllAddressesResponse;
import user.management.userManagement.business.Responses.GetByIdAddressResponse;

import java.util.List;

public interface AddressService {
    List<GetAllAddressesResponse> getAll();
    GetByIdAddressResponse getById(int id);
    void add(CreateAddressRequest createAddressRequest);
}
