package Assigment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {

    public static Map<String, Account> accountsList = new HashMap<>();

    public static void createAccountList(){
        Account account1 = new Account("Domas", "1234", 50);
        Account account2 = new Account("Tomas", "4321", 200);
        Account account3 = new Account("Lukas", "0000", 1000);

        accountsList.put(account1.getUsername(), account1);
        accountsList.put(account2.getUsername(), account2);
        accountsList.put(account3.getUsername(), account3);
    }
}
