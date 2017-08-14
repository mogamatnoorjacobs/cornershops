package www.cput.ac.za.cornershops.Factories;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import www.cput.ac.za.cornershops.Domain.BusinessDetails;
import www.cput.ac.za.cornershops.Domain.PersonDetails;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */


public class BusinessDetailsFactoryTest {

 /*   Map<String,String> values;
    Map<String,PersonDetails> personDetailsValues;


    @BeforeMethod

    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        personDetailsValues = new HashMap<String, PersonDetails>();
        values.put("businessID","1");
        values.put("businessName","2");
        values.put("businessDescription","bokmakierie");

        //***********PersonDetails*************

        personDetailsValues.put("firstName","bokmakierie","lastName","bokmakierie");


//**********Address********************************
    /*    values.put("addressId","1");

        values.put("streetNumber","2");

        values.put("streetName","bokmakierie");
        values.put("area","hazendal");
        values.put("suburb","Athlone");
        values.put("city","Cape town");
        */
//*******Contact Details****************************
   /*     values.put("cellNumber","1");

        values.put("homeNumber","John");

        values.put("emailAddress","Doe");*/

//**************Products****************************
/*        values.put("productID","1");

        values.put("productName","John");

        values.put("productDescription","Doe");


    }

    @Test
    public void testGetBusinessDetails() throws Exception {
        BusinessDetails businessDetails=BusinessDetailsFactory.getBusinessDetails(values);
        assertEquals("1",businessDetails.getBusinessId());
    }
*/
}
