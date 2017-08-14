package www.cput.ac.za.cornershops.Services.ServiceImpl;

import www.cput.ac.za.cornershops.Domain.Products;
import www.cput.ac.za.cornershops.Repositories.ImplRepository.ProductsRepositoryImpl;
import www.cput.ac.za.cornershops.Repositories.ProductsRepository;
import www.cput.ac.za.cornershops.Services.ProductsService;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class ProductsServiceImpl implements ProductsService {

        ProductsRepository repository = ProductsRepositoryImpl.getInstance();
    public Products create(Products products) {
        return repository.create(products);
    }

    public Products read(String id) {
        return repository.read(id);
    }

    public Products update(Products products) {
        return repository.update(products);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
