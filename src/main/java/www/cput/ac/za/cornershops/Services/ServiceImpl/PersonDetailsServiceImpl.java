package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.PersonDetails;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.PersonDetailsRepositoryImpl;
import www.cput.ac.za.cornershops.Repositories.PersonDetailsRepository;
import www.cput.ac.za.cornershops.Services.PersonDetailsService;

/**
 * Created by Mogamat Noor Jacobs on 10/08/2017.
 */
public class PersonDetailsServiceImpl implements PersonDetailsService {

    private static PersonDetailsServiceImpl service = null;

    PersonDetailsRepository repository = PersonDetailsRepositoryImpl.getInstance();

    public static PersonDetailsServiceImpl getInstance(){
        if(service == null)
            service = new PersonDetailsServiceImpl();
        return service;
    }

    public PersonDetails create(PersonDetails personDetails) {
        return repository.create(personDetails);
    }

    public PersonDetails read(String id) {
        return repository.read(id);
    }

    public PersonDetails update(PersonDetails personDetails) {
        return repository.update(personDetails);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
