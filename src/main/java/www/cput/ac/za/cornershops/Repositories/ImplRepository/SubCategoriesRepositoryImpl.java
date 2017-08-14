package www.cput.ac.za.cornershops.Repositories.ImplRepository;

import www.cput.ac.za.cornershops.Domain.SubCategories;
import www.cput.ac.za.cornershops.Repositories.SubCategoriesRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class SubCategoriesRepositoryImpl implements SubCategoriesRepository {

    private static SubCategoriesRepositoryImpl respository = null;

    private Map<String,SubCategories> subCategoriesTable;

    private SubCategoriesRepositoryImpl() {
        subCategoriesTable = new HashMap<String, SubCategories>();
    }

    public static SubCategoriesRepositoryImpl getInstance(){
        if(respository==null)
            respository = new SubCategoriesRepositoryImpl();
        return respository;
    }

    public SubCategories create(SubCategories subCategories) {
        subCategoriesTable.put(subCategories.getCatergoryId(),subCategories);
        SubCategories savedSubCategory= subCategoriesTable.get(subCategories.getCatergoryId());
        return savedSubCategory;
    }

    public SubCategories read(String id) {
        SubCategories subCategories = subCategoriesTable.get(id);
        return subCategories;
    }

    public SubCategories update(SubCategories subCategories) {
        subCategoriesTable.put(subCategories.getCatergoryId(),subCategories);
        SubCategories savedSubCategory = subCategoriesTable.get(subCategories.getCatergoryId());
        return savedSubCategory;
    }

    public void delete(String id) {
        subCategoriesTable.remove(id);

    }
}
