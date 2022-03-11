package eTradeApp.dataAccess.concretes;

import eTradeApp.entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    List<Product> products;

    public ProductDao() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void delete(Product product) {
        products.remove(product);
    }

    public List<Product> getAll() {
        return products;
    }

}
