package HomeAssigment.Warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Service.executeService();
        Service.executeReturnService(WarehouseList.warehouseList);

    }
}
