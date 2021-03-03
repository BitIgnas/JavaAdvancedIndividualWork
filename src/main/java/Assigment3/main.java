package Assigment3;

import Assigment4.Account;
import Assigment4.Database;
import Assigment4.TransactionService;

import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Database.createAccountList();

        System.out.println("Enter user username");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("Enter password");
        String userInputPassword = scanner.nextLine();

        for (Map.Entry<String, Account> accountEntry : Database.accountsList.entrySet()) {
            if(userInput.equals(accountEntry.getKey())){
                if(userInputPassword.equals(accountEntry.getValue().getPassword())){
                    System.out.println("Login succesful");
                    System.out.println("Your total balance: " + accountEntry.getValue().getBalance() + " $ ");

                    String toContinue = scanner.nextLine();

                    if(toContinue.equalsIgnoreCase("taip")){

                    }
                }
            }
        }



    }



}
