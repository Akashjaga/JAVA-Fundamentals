import java.util.Scanner;
public class largestandsmallest {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int a  = input.nextInt();
        int b  = input.nextInt();
        int c  = input.nextInt();

        if (a > b && a > c) {
            System.out.print("largest "+a);
        } else if (b > a && b > c) {
            System.out.print("largest "+b);
        } else  {
            System.out.print("largest "+c);
        }

        if ((b < a && a < c) || (c < a && a < b)) {
            System.out.println("Smallest " + a);
        }
        else if ((a < b && b < c) || (c < b && b < a)) {
            System.out.println("Smallest " + b);
        }
        else {
            System.out.println("Smallest " + c);
        }

    }
}