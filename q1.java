import java.util.*;

public class q1 {
    int salarytotal;
    public int salary(int basic, int agp, int da, int ta, int hra) {
        salarytotal = basic + agp + da + ta + hra;
        return salarytotal;
    }
    
    public int salary(int basic,  int ta) {
        salarytotal = basic  + ta;
        return salarytotal;
    }

    public int salary(int basic) {
        salarytotal = basic; 
        return salarytotal;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        q1 c = new q1();
        System.out.println(
                "Select the type of employee:  1 for Project Manager ; 2 for System engineer; 3 for Technical Assistant");
        int flag1 = in.nextInt();
        if (flag1 == 1) {
            System.out.println("Enter details for Project manager");
            int basic = in.nextInt();
            int agp = in.nextInt();
            int da = in.nextInt();
            int ta = in.nextInt();
            int hra = in.nextInt();
            System.out.println("the salary is: " + c.salary(basic,agp,da,ta,hra));
        } else if (flag1 == 2) {
            System.out.println("Enter details for System Engineer");
            int basic = in.nextInt();
            int ta = in.nextInt();
            System.out.println("the salary is: " + c.salary(basic,ta));
        } else if (flag1 == 3) {
            System.out.println("Enter details for Technical Assistant");
            int basic = in.nextInt();
            System.out.println("the salary is: %d" + c.salary(basic));
        }
        in.close();
    }


}