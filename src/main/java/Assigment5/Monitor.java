package Assigment5;

public class Monitor extends Gadget {

    private String brand;
    private int resolution;
    private int price;



    public Monitor(String brand, int price) {
        super(brand, price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", resolution=" + resolution +
                ", price=" + price +
                '}';
    }
}
