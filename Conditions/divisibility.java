import java.util.*;

public class divisibility {
    public static void main ( String[] arg){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if(userInput % 5 == 0 && userInput % 3 == 0){
            System.out.println( "Entered number is divisible by both :" + userInput );
        } else if (userInput % 5 == 0) {
             System.out.println( "Entered number is divisible by 5 :"+ userInput);
        } else if (userInput % 3 == 0){
             System.out.println( "Entered number is divisible by 3 :"+ userInput);
        } else {
            System.out.println( "Entered number Neither divisible by Both :"+ userInput);
        }
    }    
}
