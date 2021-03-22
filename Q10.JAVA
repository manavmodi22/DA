import java.util.*;
class NameAndCount{
    String data_name;
    int count;
    
    NameAndCount(String data_name,int count){
        this.data_name=data_name;
        this.count=count;
    }
    public String getName() {
        return data_name;
        
    }
    public int getCount() {
        
        return count;
    }
    public void increment(){
        count= count + 1;
    }

}

abstract class student implements Comparable<NameAndCount>{
    int count;
    String data_name;
    student(String data_name,int count){
        this.data_name=data_name;
        this.count=count;
    }
    public int equals(NameAndCount p) {
       int flag = data_name.compareTo(p.data_name);
        return flag;
    }
}

public class Main{ 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        String data_name=s.nextLine();
        System.out.println("Enter the count:");
        int count=s.nextInt();
        NameAndCount c =new NameAndCount(data_name,count);
        student p= new student();
        c.getName();
        c.getCount();
        c.increment();
        p.equals();
}}