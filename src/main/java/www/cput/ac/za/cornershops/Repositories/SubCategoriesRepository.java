package www.cput.ac.za.cornershops.Repositories;

import www.cput.ac.za.cornershops.Domain.SubCategories;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface SubCategoriesRepository {
    SubCategories create(SubCategories subCategories);

    SubCategories read(String id);

    SubCategories update(SubCategories subCategories);

    void delete(String id);
}
