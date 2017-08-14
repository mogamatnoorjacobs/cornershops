package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.ContactDetails;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class ContactDetailsFactory
{
  /* public static ContactDetails getContactDetails(String cellNumber,String homeNumber,String emailAddress) {
       ContactDetails contactDetails = new ContactDetails.Builder()
               .cellNumber(cellNumber)
               .homeNumber(homeNumber)
               .emailAddress(emailAddress)
               .build();
       return contactDetails;
   }*/
   public static ContactDetails getContactDetails(Map<String,String>values){
       ContactDetails contactDetails = new ContactDetails.Builder()
               .cellNumber(values.get("cellNumber"))
               .homeNumber(values.get("homeNumber"))
               .emailAddress(values.get("emailAddress"))
               .build();
       return contactDetails;
    }

}
