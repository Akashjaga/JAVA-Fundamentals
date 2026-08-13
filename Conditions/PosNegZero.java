import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput > 0) {
            System.out.println("Given is positive Number : " + userInput);
        } else if (userInput == 0) {
            System.out.println("Given is Zero Number : " + userInput);
        } else {
            System.out.println("Given is Negative Number : " + userInput);
        }
    }
}
