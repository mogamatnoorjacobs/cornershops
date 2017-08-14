package www.cput.ac.za.cornershops.Factories;

import www.cput.ac.za.cornershops.Domain.MainCategories;
import www.cput.ac.za.cornershops.Domain.SubCategories;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class MainCategoriesFactory
{
    public static MainCategories getMainCategories(Map<String, String> values){
        MainCategories mainCategories = new MainCategories.Builder()
                .categoryId(values.get("categoryId"))
                .category(values.get("category"))
                .build();
        return mainCategories;
    }
}
