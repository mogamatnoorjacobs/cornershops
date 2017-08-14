package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.MainCategories;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.MainCategoriesRepositoryImpl;
import www.cput.ac.za.cornershops.Repositories.MainCategoriesRepository;
import www.cput.ac.za.cornershops.Services.MainCategoriesService;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class MainCategoriesServiceImpl implements MainCategoriesService {

    MainCategoriesRepository repository = MainCategoriesRepositoryImpl.getInstance();
    public MainCategories create(MainCategories MainCategories) {
        return repository.create(MainCategories);
    }

    public MainCategories read(String id) {
        return repository.read(id);
    }

    public MainCategories update(MainCategories MainCategories) {
        return repository.update(MainCategories);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
