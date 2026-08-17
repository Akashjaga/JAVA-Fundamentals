import java.util.*;

static double averageofthree(int a, int b, int c){
    return (a + b + c) / 3.0;
}

public static void main(String[] arg){

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    double sumofaverage = averageofthree(a, b, c);
    System.out.printf("%.2f",sumofaverage);
}