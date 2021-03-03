package Assigment2;

import java.util.Scanner;

public class Main {
    public static SeaShipping main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Shipping shipping = null;

        if (userInput.equalsIgnoreCase("sea shipping")) {
            shipping = new SeaShipping();
        } else if (userInput.equalsIgnoreCase("air shipping")) {
            shipping = new AirShipping();
        } else if (userInput.equalsIgnoreCase("ground shipping")) {
            shipping = new GroundShipping();
        } else {
            System.out.println("Wrong input");
        }
        return null;
    }
}


