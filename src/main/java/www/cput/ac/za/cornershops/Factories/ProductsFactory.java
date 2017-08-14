package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.Products;
import www.cput.ac.za.cornershops.Domain.SubCategories;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class ProductsFactory {
    public static Products getSubCategories(Map<String, String> values, SubCategories subCategories){
        Products products = new Products.Builder()
                .productID(values.get("productID"))
                .productName(values.get("productName"))
                .productDescription(values.get("productDescription"))
                .subCategories(subCategories)
                .build();
        return products;
    }
}
