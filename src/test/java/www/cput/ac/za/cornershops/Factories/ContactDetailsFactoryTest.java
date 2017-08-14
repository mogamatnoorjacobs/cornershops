package www.cput.ac.za.cornershops.Factories;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import www.cput.ac.za.cornershops.Domain.ContactDetails;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class ContactDetailsFactoryTest {


 /*       private String cellNumber = "025246";
        private String homeNumber = "6578";
        private String emailAddress = "jfjks";*/

    Map<String,String> values;



    @BeforeMethod

    public void setUp() throws Exception {

        values = new HashMap<String, String>();

        values.put("cellNumber","1");

        values.put("homeNumber","John");

        values.put("emailAddress","Doe");

    }


    @Test
    public void testGetContactDetails() throws Exception
    {
        ContactDetails contactDetails=ContactDetailsFactory.getContactDetails(values);

        assertEquals("Doe",contactDetails.getEmailAddress());

    }


  /*  public void testGetContactDetails() throws Exception
    {
        ContactDetails contactDetails=ContactDetailsFactory.getContactDetails(cellNumber,homeNumber,emailAddress);

        assertEquals("025246",contactDetails.getCellNumber());

    }*/

}