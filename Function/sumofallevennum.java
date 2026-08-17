import java.util.*;

public class sumofallevennum {

    static int addsumofevennum (int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            if( i % 2 == 0){
                sum = sum + i;
            }
        } return sum;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
       int result = addsumofevennum(n);
        System.out.print(result);  
    }  
}
