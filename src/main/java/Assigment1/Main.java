package Assigment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OS windows = new Windows("Windows xp", 140, "1401");
        OS linux = new Linux("Linux", 0, true, "Mint");
        OS mac = new Mac("Mac", 2000, true, true);

        List<OS> osList = new ArrayList<>();
        osList.add(windows);
        osList.add(linux);
        osList.add(mac);

        for (OS os : osList){
            System.out.println(os.getName() + " price: " + os.getPrice() + " " + os);
        }
    }
}
