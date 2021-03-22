import java.util.*;

abstract class SHAPE {
    double area;
    abstract void get_data();

    Scanner s = new Scanner(System.in);

    abstract void display_area();

}

class square extends SHAPE {
    int side;

    void get_data() {

        side = s.nextInt();
    }

    void display_area() {
        area = side * side;
        System.out.println("The area of square is:  " + area);

    }
}

class rectangle extends SHAPE {
    int length, breadth;

    void get_data() {

        length = s.nextInt();
        breadth = s.nextInt();
    }

    void display_area() {
        area = length * breadth;
        System.out.println("The area of rectangle is:  " + area);

    }
}

class triangle extends SHAPE {
    int base, height;

    void get_data() {

        base = s.nextInt();
        height = s.nextInt();
    }

    void display_area() {
        area = base * height*0.5;
        System.out.println("The area of triangle is:  " + area);

    }
}

class circle extends SHAPE {
    int radius;

    void get_data() {
        radius = s.nextInt();
    }

    void display_area() {
        area = 2*radius * 3.14;
        System.out.println("The area of circle is:  " + area);

    }
}

class ellipse extends SHAPE {
    int xrad, yrad;

    void get_data() {

        xrad = s.nextInt();
        yrad = s.nextInt();
    }

    void display_area() {
        area = xrad * yrad * 3.14;
        System.out.println("The area of ellipse is:  " + area);

    }
}

public class q2 {
    public static void main(String args[]) {
        Scanner sm = new Scanner(System.in);
        System.out.println(
                "Press the following numbers to find the areas: 1 for Rectangle ; 2 for Square ; 3 for Triangle ; 4 for Circle ; 5 for Ellipse");
        int flag = sm.nextInt();
        rectangle r = new rectangle();
        triangle t = new triangle();
        square sq = new square();
        circle c = new circle();
        ellipse e = new ellipse();
        if (flag == 1) {
            r.get_data();
            r.display_area();
        } else if (flag == 2) {
            sq.get_data();
            sq.display_area();
        } else if (flag == 3) {
            t.get_data();
            t.display_area();
        } else if (flag == 4) {
            c.get_data();
            c.display_area();
        } else if (flag == 5) {
            e.get_data();
            e.display_area();
        }
        sm.close();
    }
}