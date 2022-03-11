package eTradeApp.api;

import eTradeApp.business.concretes.ProductManager;
import eTradeApp.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Elma", 35);
        Product product2 = new Product(2, "Armut", 35);
        Product product3 = new Product(3, "ELma", 35);
        Product product4 = new Product(4, "Muz", 35);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product4);
        productManager.add(product3);//Aynı ürün ekleniyor.
        System.out.println("----- ÜRÜNLER ------");

        for (Product item : productManager.getAll()) {
            System.out.println(item.getName());
        }
        System.out.println("-------------------");
        productManager.delete(product2);
        System.out.println("-----SİLME İŞLEMİNDEN SONRA ÜRÜNLER------");
        for (Product item : productManager.getAll()) {
            System.out.println(item.getName());
        }
        System.out.println("-------------------");
    }
}
