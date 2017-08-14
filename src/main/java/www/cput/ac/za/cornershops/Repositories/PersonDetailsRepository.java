package www.cput.ac.za.cornershops.Repositories;

import www.cput.ac.za.cornershops.Domain.PersonDetails;

/**
 * Created by Mogamat Noor Jacobs on 10/08/2017.
 */
public interface PersonDetailsRepository {

    PersonDetails create(PersonDetails personDetails);

    PersonDetails read(String id);

    PersonDetails update(PersonDetails personDetails);

    void delete(String id);

}
