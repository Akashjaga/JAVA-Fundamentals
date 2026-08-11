import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

        if (userInput % 100 == 0 || userInput % 4 == 0){
            System.out.print("Entered Input is a leap year");
        } else {
            System.out.print("Entered Input is Not a leap year");
        }

    }
}