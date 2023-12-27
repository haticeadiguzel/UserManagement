package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.Requests.CreateAddressRequest;
import user.management.userManagement.business.Responses.GetAllAddressesResponse;
import user.management.userManagement.business.Responses.GetByIdAddressResponse;
import user.management.userManagement.business.abstracts.AddressService;
import user.management.userManagement.dataAccess.abstracts.AddressRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AddressManager implements AddressService {
    private AddressRepository addressRepository;

    @Override
    public List<GetAllAddressesResponse> getAll() {
        return null;
    }

    @Override
    public GetByIdAddressResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateAddressRequest createAddressRequest) {

    }
}
