import java.util.*;
class Person {
    String name, address;
    int age;

    void person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class Employee extends Person {
    int salary;

    void Employee() {
        this.salary = salary;
    }

    void Employee(Person p) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}


public class q6 {
    public static void main() {
        Employee e = new Employee();
        Person p = new Person();
        Scanner s = new Scanner(System.in);
        p.name = s.nextLine();
        p.address = s.nextLine();
        p.age = s.nextInt();
        e.salary = s.nextInt();
        System.out.println("The employee details are:/nName: " + e.name + "/n Age: " + e.age + "/n Address: " + e.address + "/n Salary:" + e.salary);
        s.close();
    }
}
