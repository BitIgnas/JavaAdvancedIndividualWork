package Assigment5;

import java.util.List;

public class ComputerSet {
    private String brand;
    private int price;
    private Monitor monitor;
    private Processor processor;
    private List<Gadget> gadgetList;

    public ComputerSet(String brand, Monitor monitor, Processor processor, List<Gadget> gadgetList) {
        this.brand = brand;
        this.monitor = monitor;
        this.processor = processor;
        this.gadgetList = gadgetList;

        getPrice();
    }

    public ComputerSet(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        int sum = 0;

        for (Gadget gadget : gadgetList) {
            sum += gadget.getPrice();
        }
        this.price = monitor.getPrice() + processor.getPrice() + sum;

        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComputerSet{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", monitor=" + monitor +
                ", processor=" + processor +
                ", gadgetList=" + gadgetList +
                '}';
    }


}
