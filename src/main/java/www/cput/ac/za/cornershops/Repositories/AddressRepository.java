package www.cput.ac.za.cornershops.Repositories;

import www.cput.ac.za.cornershops.Domain.Address;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface AddressRepository {
    Address create(Address address);

    Address read(String id);

    Address update(Address address);

    void delete(String id);
}
