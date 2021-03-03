package HomeAssigment.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class WarehouseList {

    public static List<Warehouse> warehouseList = new ArrayList<>();

    public static void addToWarehouse(String product, double price, int amount){
        warehouseList.add(new Warehouse(product, price, amount));
    }

    public static void userSetQuantity(String userProduct, int userQuantity, List<Warehouse> warehouseList) {
        for (Warehouse warehouse : warehouseList) {
            if (userProduct.equalsIgnoreCase(warehouse.getProduct())) {

                warehouse.setAmount(userQuantity);
                System.out.println(userQuantity + " quantity added to " + warehouse.getProduct());
                break;
            }
        }
    }
}
