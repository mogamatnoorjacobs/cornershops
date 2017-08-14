package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.ContactDetails;
import www.cput.ac.za.cornershops.Repositories.ContactDetailsRepository;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.ContactDetailsRepositoryImpl;
import www.cput.ac.za.cornershops.Services.ContactDetailsService;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class ContactDetailsServiceImpl implements ContactDetailsService {

    ContactDetailsRepository repository = ContactDetailsRepositoryImpl.getInstance();
    public ContactDetails create(ContactDetails contactDetails) {
        return repository.create(contactDetails);
    }

    public ContactDetails read(String cellNumber) {
        return repository.read(cellNumber);
    }

    public ContactDetails update(ContactDetails contactDetails) {
        return repository.update(contactDetails);
    }

    public void delete(String cellNumber) {
        repository.delete(cellNumber);
    }
    
    
}
