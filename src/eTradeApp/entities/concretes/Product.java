package eTradeApp.entities.concretes;

import eTradeApp.entities.abstracts.Entity;

public class Product extends Entity {

    private double unitPrice;

    public Product() {
    }

    public Product(int id, String name, double unitPrice) {
        super(id, name);
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
