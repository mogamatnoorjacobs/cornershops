package www.cput.ac.za.cornershops.Services;

import www.cput.ac.za.cornershops.Domain.ContactDetails;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface ContactDetailsService {
    ContactDetails create(ContactDetails contactDetails);
    ContactDetails read(String id);
    ContactDetails update(ContactDetails contactDetails);
    void delete (String id);
}
