import java.util.Scanner;
public class EvenOdd {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput % 2 == 0 ){
            System.out.println("Entered Input is true and Even");
        } else {
            System.out.println("Entered Input is False and Odd");
        }
    }
}
