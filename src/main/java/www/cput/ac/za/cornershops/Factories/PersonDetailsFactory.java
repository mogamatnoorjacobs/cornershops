package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.Address;
import www.cput.ac.za.cornershops.Domain.BusinessDetails;
import www.cput.ac.za.cornershops.Domain.ContactDetails;
import www.cput.ac.za.cornershops.Domain.PersonDetails;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 10/08/2017.
 */
public class PersonDetailsFactory {
    public static PersonDetails getPersonDetails(Map<String, String> values, Address address, ContactDetails contactDetails, BusinessDetails businessDetails)
    {
        PersonDetails personDetails = new PersonDetails.Builder()
                .id(values.get("id"))
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .address(address)
               .contactDetails(contactDetails)
                .businessDetails(businessDetails)
                .build();
        return personDetails;
    }
}
