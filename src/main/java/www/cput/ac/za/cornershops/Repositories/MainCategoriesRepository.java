package www.cput.ac.za.cornershops.Repositories;

import www.cput.ac.za.cornershops.Domain.MainCategories;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface MainCategoriesRepository {
    MainCategories create(MainCategories mainCategories);

    MainCategories read(String id);

    MainCategories update(MainCategories mainCategories);

    void delete(String id);

}
