package user.management.userManagement.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user.management.userManagement.entities.concretes.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
