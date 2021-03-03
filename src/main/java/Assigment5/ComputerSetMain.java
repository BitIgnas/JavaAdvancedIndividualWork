package Assigment5;

import java.util.ArrayList;
import java.util.List;

public class ComputerSetMain {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Samsung", 279);
        Processor processor1 = new Processor("amd", 179);

        Gadget keyboard1 = new Keyboard("Logitech", 59, "Black", true);
        Gadget mouse1 = new Mouse("Asus", 17);
        Gadget headphones1 = new HeadPhones("Razer", 79);

        List<Gadget> gadgetList = new ArrayList<>();
        gadgetList.add(keyboard1);
        gadgetList.add(mouse1);
        gadgetList.add(headphones1);

        ComputerSet computerSet = new ComputerSet("HP", monitor1, processor1, gadgetList );
        System.out.println(computerSet.toString());






    }
}
