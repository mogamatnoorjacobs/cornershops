package www.cput.ac.za.cornershops.Repositories.ImplRepository;

import www.cput.ac.za.cornershops.Domain.PersonDetails;
import www.cput.ac.za.cornershops.Repositories.PersonDetailsRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 10/08/2017.
 */
public class PersonDetailsRepositoryImpl implements PersonDetailsRepository
{

    private static PersonDetailsRepositoryImpl respository = null;

    private Map<String,PersonDetails> personDetailsTable;

    private PersonDetailsRepositoryImpl() {
        personDetailsTable = new HashMap<String, PersonDetails>();
    }

    public static PersonDetailsRepositoryImpl getInstance(){
        if(respository==null)
            respository = new PersonDetailsRepositoryImpl();
        return respository;
    }

    public PersonDetails create(PersonDetails personDetails) {
        personDetailsTable.put(personDetails.getID(),personDetails);
        PersonDetails savedPersonDetails = personDetailsTable.get(personDetails.getID());
        return savedPersonDetails;
    }

    public PersonDetails read(String id) {
        PersonDetails personDetails = personDetailsTable.get(id);
        return personDetails;
    }

    public PersonDetails update(PersonDetails personDetails) {
        personDetailsTable.put(personDetails.getID(),personDetails);
        PersonDetails savedPersonDetails = personDetailsTable.get(personDetails.getID());
        return savedPersonDetails;
    }

    public void delete(String id) {
        personDetailsTable.remove(id);

    }



}
