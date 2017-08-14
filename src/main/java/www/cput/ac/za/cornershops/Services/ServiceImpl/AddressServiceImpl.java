package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.Address;
import www.cput.ac.za.cornershops.Repositories.AddressRepository;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.AddressRepositoryImpl;
import www.cput.ac.za.cornershops.Services.AddressService;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class AddressServiceImpl implements AddressService {

    AddressRepository repository = AddressRepositoryImpl.getInstance();
    public Address create(Address address) {
        return repository.create(address);
    }

    public Address read(String id) {
        return repository.read(id);
    }

    public Address update(Address address) {
        return repository.update(address);
    }

    public void delete(String id) {
        repository.delete(id);

    }
    
    
}
