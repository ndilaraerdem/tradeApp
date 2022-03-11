package eTradeApp.business.concretes;

import eTradeApp.dataAccess.concretes.ProductDao;
import eTradeApp.entities.concretes.Product;

import java.util.List;

public class ProductManager {
    ProductDao productDao = new ProductDao();
    boolean control = false;
    List<Product> products = productDao.getAll();
    public void add(Product product) {

        for (Product item : products) {
            if (item.getName().equalsIgnoreCase(product.getName())) {
                control= true;
                break;
            }
        }
        if(control){
            System.out.println( product.getName() + " Ürünü zaten var!");
        }
        else{
            productDao.add(product);
        }

    }
    public void delete(Product product){
        products.remove(product);
        System.out.println(product.getName()+" Ürünü başarıyla silindi.");
    }
    public List<Product> getAll(){
        return productDao.getAll();
    }
}
