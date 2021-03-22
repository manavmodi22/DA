import java.util.*;

class StringRotation {

    boolean areRotations(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }}
    public class q7{

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("String1 ");
            String str1 = in.nextLine();
            System.out.println("String2 ");
            String str2 = in.nextLine();
            StringRotation r = new StringRotation();

            if (r.areRotations(str1, str2))
                System.out.println("Strings are rotations of each other");
            else
                System.out.printf("Strings are not rotations of each other");
            in.close();
    }
}

