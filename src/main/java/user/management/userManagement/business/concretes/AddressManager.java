package user.management.userManagement.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import user.management.userManagement.business.DTOs.Requests.Create.CreateAddressRequest;
import user.management.userManagement.business.DTOs.Requests.Update.UpdateAddressRequest;
import user.management.userManagement.business.DTOs.Responses.GetAll.GetAllAddressesResponse;
import user.management.userManagement.business.DTOs.Responses.GetById.GetByIdAddressResponse;
import user.management.userManagement.business.abstracts.AddressService;
import user.management.userManagement.core.utilities.mappers.ModelMapperService;
import user.management.userManagement.dataAccess.abstracts.AddressRepository;
import user.management.userManagement.entities.concretes.Address;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AddressManager implements AddressService {
    private AddressRepository addressRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllAddressesResponse> getAll() {
        List<Address> addresses = addressRepository.findAll();
        List<GetAllAddressesResponse> addressesResponse = addresses.stream()
                .map(address->this.modelMapperService.forResponse().map(address, GetAllAddressesResponse.class))
                .collect(Collectors.toList());
        return addressesResponse;
    }

    @Override
    public GetByIdAddressResponse getById(int id) {
        Address address = this.addressRepository.findById(id).orElseThrow();
        GetByIdAddressResponse response = this.modelMapperService.forResponse().map(address, GetByIdAddressResponse.class);
        return response;
    }

    @Override
    public void add(CreateAddressRequest createAddressRequest) {
        Address address = this.modelMapperService.forRequest().map(createAddressRequest, Address.class);
        this.addressRepository.save(address);
    }

    @Override
    public void update(UpdateAddressRequest updateAddressRequest) {
        Address address = this.modelMapperService.forRequest().map(updateAddressRequest, Address.class);
        this.addressRepository.save(address);
    }

    @Override
    public void delete(int id) {
        this.addressRepository.deleteById(id);
    }
}
