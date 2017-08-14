package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.SubCategories;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.SubCategoriesRepositoryImpl;
import www.cput.ac.za.cornershops.Repositories.SubCategoriesRepository;
import www.cput.ac.za.cornershops.Services.SubCategoriesService;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class SubCategoriesServiceImpl implements SubCategoriesService {

        SubCategoriesRepository repository = SubCategoriesRepositoryImpl.getInstance();
    public SubCategories create(SubCategories subCategories) {
        return repository.create(subCategories);
    }

    public SubCategories read(String id) {
        return repository.read(id);
    }

    public SubCategories update(SubCategories subCategories) {
        return repository.update(subCategories);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
