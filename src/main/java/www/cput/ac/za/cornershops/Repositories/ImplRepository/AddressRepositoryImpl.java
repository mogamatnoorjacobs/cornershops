package www.cput.ac.za.cornershops.Repositories.ImplRepository;


import www.cput.ac.za.cornershops.Domain.Address;
import www.cput.ac.za.cornershops.Repositories.AddressRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class AddressRepositoryImpl implements AddressRepository {

    private static AddressRepositoryImpl respository = null;

    private Map<String,Address> addressTable;

    private AddressRepositoryImpl() {
        addressTable = new HashMap<String, Address>();
    }

    public static AddressRepositoryImpl getInstance(){
        if(respository==null)
            respository = new AddressRepositoryImpl();
        return respository;
    }

    public Address create(Address address) {
        addressTable.put(address.getAddressId(),address);
        Address savedPerson = addressTable.get(address.getAddressId());
        return savedPerson;
    }

    public Address read(String id) {
        Address address = addressTable.get(id);
        return address;
    }

    public Address update(Address address) {
        addressTable.put(address.getAddressId(),address);
        Address savedAddress = addressTable.get(address.getAddressId());
        return savedAddress;
    }

    public void delete(String id) {
        addressTable.remove(id);

    }
}
