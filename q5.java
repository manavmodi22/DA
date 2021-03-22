import java.util.*;
import java.io.*;
interface advancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements advancedArithmetic {

    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        
        return sum;
    }
}


public class q5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        MyCalculator c = new MyCalculator();
        System.out.print(c.divisor_sum(n));
        in.close();
    }
    
}
