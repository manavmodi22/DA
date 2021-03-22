import java.util.*;

public class q4 {
    public double getFine(int l, int s) {
        int diff = s - l;
        double fine;
        if (diff > 0) {
            fine = (0.15 * diff);
        }
        else {
            fine= 0.0;
        }
        return fine;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        q4 q = new q4();
        System.out.println("Enter the speeding limit");
        int limit = s.nextInt();
        System.out.println("Enter the speed");
        int speed = s.nextInt();
        System.out.println("The fine is :" + q.getFine(limit, speed));
        s.close();
    }
}
