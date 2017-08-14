package www.cput.ac.za.cornershops.Factories;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import www.cput.ac.za.cornershops.Domain.Address;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class AddressFactoryTest {

    Map<String,String> values;

    @BeforeMethod

    public void setUp() throws Exception {

        values = new HashMap<String, String>();

        values.put("addressId","1");

        values.put("streetNumber","2");

        values.put("streetName","bokmakierie");
        values.put("area","hazendal");
        values.put("suburb","Athlone");
        values.put("city","Cape town");

    }


    @Test
    public void testGetAddress() throws Exception {
        Address address=AddressFactory.getAddress(values);
        assertEquals("1",address.getAddressId());

    }

}