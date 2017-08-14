package www.cput.ac.za.cornershops.Repositories.ImplRepository;

import www.cput.ac.za.cornershops.Domain.Products;
import www.cput.ac.za.cornershops.Repositories.ProductsRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 14/08/2017.
 */
public class ProductsRepositoryImpl implements ProductsRepository {

    private static ProductsRepositoryImpl respository = null;

    private Map<String,Products> productsTable;

    private ProductsRepositoryImpl() {
        productsTable = new HashMap<String, Products>();
    }

    public static ProductsRepositoryImpl getInstance(){
        if(respository==null)
            respository = new ProductsRepositoryImpl();
        return respository;
    }

    public Products create(Products products) {
        productsTable.put(products.getProductID(),products);
        Products savedProducts = productsTable.get(products.getProductID());
        return savedProducts;
    }

    public Products read(String id) {
        Products products = productsTable.get(id);
        return products;
    }

    public Products update(Products products) {
        productsTable.put(products.getProductID(),products);
        Products savedProducts = productsTable.get(products.getProductID());
        return savedProducts;
    }

    public void delete(String id) {
        productsTable.remove(id);

    }
}
