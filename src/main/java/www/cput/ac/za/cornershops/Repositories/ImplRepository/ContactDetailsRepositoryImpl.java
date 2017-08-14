package www.cput.ac.za.cornershops.Repositories.ImplRepository;

import www.cput.ac.za.cornershops.Domain.ContactDetails;
import www.cput.ac.za.cornershops.Repositories.ContactDetailsRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class ContactDetailsRepositoryImpl implements ContactDetailsRepository{

    private static ContactDetailsRepositoryImpl respository = null;

    private Map<String,ContactDetails> contactDetailsTable;

    private ContactDetailsRepositoryImpl() {
        contactDetailsTable = new HashMap<String, ContactDetails>();
    }

    public static ContactDetailsRepositoryImpl getInstance(){
        if(respository==null)
            respository = new ContactDetailsRepositoryImpl();
        return respository;
    }

    public ContactDetails create(ContactDetails contactDetails) {
        contactDetailsTable.put(contactDetails.getCellNumber(),contactDetails);
        ContactDetails savedContactDetails = contactDetailsTable.get(contactDetails.getCellNumber());
        return savedContactDetails;
    }

    public ContactDetails read(String cellNumber) {
        ContactDetails contactDetails = contactDetailsTable.get(cellNumber);
        return contactDetails;
    }

    public ContactDetails update(ContactDetails contactDetails) {
        contactDetailsTable.put(contactDetails.getCellNumber(),contactDetails);
        ContactDetails savedContactDetails = contactDetailsTable.get(contactDetails.getCellNumber());
        return savedContactDetails;
    }

    public void delete(String cellNumber) {
        contactDetailsTable.remove(cellNumber);

    }
}
