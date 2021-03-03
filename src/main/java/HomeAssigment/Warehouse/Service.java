package HomeAssigment.Warehouse;

import java.util.List;
import java.util.Scanner;

public class Service {

    public static void warehouseService() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("If you like to add product enter - yes");
        String userInput = scanner.nextLine();

        String temp = " ";

        if (userInput.equalsIgnoreCase("yes")) {

            System.out.println("Enter product ");
            String userProduct = scanner.nextLine();

            System.out.println("Enter price");
            double userProductPrice = scanner.nextDouble();

            System.out.println("Enter amount");
            int userAmount = scanner.nextInt();

            WarehouseList.addToWarehouse(userProduct, userProductPrice, userAmount);
        }
    }

    public static void executeService() {
        Scanner scanner = new Scanner(System.in);
        String temp = "";

        while (!temp.equalsIgnoreCase("stop")) {
            warehouseService();

            System.out.println("If you're finished enter - stop");
            temp = scanner.nextLine();
        }
    }

    public static void executeReturnService(List<Warehouse> warehouseList) {
        Scanner scanner = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        char userOption = 'o';

        do {
            System.out.println("**************************");
            System.out.println("Select of given operations");
            System.out.println("a - get total price");
            System.out.println("b - display all products");
            System.out.println("c - add product");
            System.out.println("r - remove product");
            System.out.println("d - to change product quantity");
            System.out.println("q - to quit");
            System.out.println("**************************");
            userOption = scanner.next().charAt(0);

            switch (userOption) {
                case 'a':
                    double sum = 0;

                    System.out.println("Total price:");
                    for (Warehouse warehouse : warehouseList) {
                        sum += warehouse.getPrice();
                    }
                    System.out.println(sum);
                    break;

                case 'b':
                    System.out.println("All products:");
                    for (Warehouse warehouse : warehouseList) {
                        System.out.println("Product: " + warehouse.getProduct() + " quantity: " + warehouse.getAmount());
                    }
                    break;

                case 'c':
                    System.out.println("Enter product/price/amount");
                    warehouseService();
                    break;

                case 'd':
                    System.out.println("Enter product name that amount you like to change");
                    String userProduct = userInput.nextLine();

                    System.out.println("Enter quantity you like to change");
                    int userQuantity = userInput.nextInt();

                    WarehouseList.userSetQuantity(userProduct, userQuantity, warehouseList);

                case 'r':
                    int userProductName = scanner.nextInt();

                    warehouseList.remove(userProductName);


            }
        }   while (userOption != 'q') ;
    }
}




