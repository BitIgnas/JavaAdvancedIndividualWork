package HomeAssigment.Warehouse;

import java.util.List;

public class Warehouse {

    private String product;
    private double price;
    private int amount;
    List<Warehouse> warehouseList;



    public Warehouse(String product, double price, int amount){
        this.product = product;
        this.price = price;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalPrice (){
        double sum = 0;

        for (Warehouse warehouse : warehouseList) {
            sum += warehouse.price;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
