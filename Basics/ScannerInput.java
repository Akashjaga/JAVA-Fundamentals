import java.util.Scanner;

public class ScannerInput {
    public static void min ( String[ ] arg){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        String b = input.next();
        String c = input.nextLine(); //prints the whole line
        double d = input.nextDouble();
    }
}
