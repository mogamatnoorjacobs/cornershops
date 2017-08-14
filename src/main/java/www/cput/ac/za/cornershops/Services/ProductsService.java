package www.cput.ac.za.cornershops.Services;

import www.cput.ac.za.cornershops.Domain.Products;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public interface ProductsService {
    Products create(Products products);
    Products read(String id);
    Products update(Products products);
    void delete (String id);
}
