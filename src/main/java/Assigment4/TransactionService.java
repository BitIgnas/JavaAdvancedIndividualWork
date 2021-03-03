package Assigment4;

public class TransactionService {

    public static void depositMoney(int totalBalance, int amount){
        double result = 0;

        result = totalBalance + amount;
        System.out.println(result);
    }

    public static void withdrawMoney(int totalBalance, int amount){

        if(totalBalance >= amount){
            double result = 0;

            result = totalBalance - amount;
            System.out.println(result);
        } else {
            System.out.println("Cannot withdraw");
        }
    }
}
