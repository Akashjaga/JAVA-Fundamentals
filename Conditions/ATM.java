import java.util.*;
public class ATM {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Amount to be withdrawn ");
        int userInput = input.nextInt();

        int balance = 10000;
        int withdrawal = userInput;
        int balanceAfter = balance - userInput;

        if (userInput % 100 == 0 && userInput <= balance){
            System.out.println("Withdrawl Successfull");
            System.out.println("Remaining Balance = " + balanceAfter);
        } else if (userInput > balance){
            System.out.println("you Dont have Enough balance to withdraw amount");
        }

    }
}
