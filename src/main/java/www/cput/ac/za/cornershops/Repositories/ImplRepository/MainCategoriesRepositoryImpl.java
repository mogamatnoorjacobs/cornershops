package www.cput.ac.za.cornershops.Repositories.ImplRepository;

import www.cput.ac.za.cornershops.Domain.MainCategories;
import www.cput.ac.za.cornershops.Repositories.MainCategoriesRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class MainCategoriesRepositoryImpl implements MainCategoriesRepository{

    private static MainCategoriesRepositoryImpl respository = null;

    private Map<String,MainCategories> mainCategoriesTable;

    private MainCategoriesRepositoryImpl() {
        mainCategoriesTable = new HashMap<String, MainCategories>();
    }

    public static MainCategoriesRepositoryImpl getInstance(){
        if(respository==null)
            respository = new MainCategoriesRepositoryImpl();
        return respository;
    }

    public MainCategories create(MainCategories mainCategories) {
        mainCategoriesTable.put(mainCategories.getCatergoryId(),mainCategories);
        MainCategories savedMainCategories = mainCategoriesTable.get(mainCategories.getCatergoryId());
        return savedMainCategories;
    }

    public MainCategories read(String id) {
        MainCategories mainCategories = mainCategoriesTable.get(id);
        return mainCategories;
    }

    public MainCategories update(MainCategories mainCategories) {
        mainCategoriesTable.put(mainCategories.getCatergoryId(),mainCategories);
        MainCategories savedMainCategories = mainCategoriesTable.get(mainCategories.getCatergoryId());
        return savedMainCategories;
    }

    public void delete(String id) {
        mainCategoriesTable.remove(id);

    }
}
