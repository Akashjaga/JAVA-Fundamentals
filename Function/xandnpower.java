import java.util.*;

public class xandnpower {
    
    static int sumandpowervalue (int x, int n){
        int sum = 1;
        for(int i = 1 ; i <= n; i++){
            sum = sum * x;
        } return sum;
    } 

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int n = input.nextInt();

        int result = sumandpowervalue(x, n);
        System.out.println(result);
    }
}
