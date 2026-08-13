public class largestnum {

    public static void main(String[] arg) {
        int a = 4500;
        int b = 600;
        int c = 1200;

        if (a > b && a > c) {
            System.out.print(a);
        } else if (b > a && b > c) {
            System.out.print(b);
        } else  {
            System.out.print(c);
        }
    }
}