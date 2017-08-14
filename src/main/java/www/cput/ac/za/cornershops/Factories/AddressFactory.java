package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.Address;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class AddressFactory {

    public static Address getAddress(Map<String, String> values){
        Address address = new Address.Builder()
                .addressId(values.get("addressId"))
                .streetNumber(values.get("streetNumber"))
                .streetName(values.get("streetName"))
                .area(values.get("area"))
                .suburb(values.get("suburb"))
                .city(values.get("city"))
                .build();
        return address;
    }
}
