package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.MainCategories;
import www.cput.ac.za.cornershops.Domain.SubCategories;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class SubCategoriesFactory {
    public static SubCategories getSubCategories(Map<String, String> values,MainCategories mainCategories){
        SubCategories subCategories = new SubCategories.Builder()
                .subCategoryId(values.get("subCategoryId"))
                .subCategory(values.get("subCategory"))
                .mainCategories(mainCategories)
                .build();
        return subCategories;
    }
}
