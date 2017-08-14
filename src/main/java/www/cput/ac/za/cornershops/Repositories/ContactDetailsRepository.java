package www.cput.ac.za.cornershops.Repositories;

import www.cput.ac.za.cornershops.Domain.ContactDetails;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface ContactDetailsRepository {
    ContactDetails create(ContactDetails contactDetails);

    ContactDetails read(String cellNumber);

    ContactDetails update(ContactDetails contactDetails);

    void delete(String cellNumber);
}
