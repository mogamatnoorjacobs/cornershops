package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.BusinessDetails;
import www.cput.ac.za.cornershops.Domain.PersonDetails;
import www.cput.ac.za.cornershops.Domain.Products;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class BusinessDetailsFactory
{
    public static BusinessDetails getBusinessDetails(Map<String, String> values, PersonDetails personDetails,Products products){
        BusinessDetails businessDetails = new BusinessDetails.Builder()
        .businessID(values.get("businessID"))
        .businessName(values.get("businessName"))
        .businessDescription(values.get("businessDescription"))
        .personDetails(personDetails)
        .products(products)
        .build();
        return businessDetails;
    }

}
