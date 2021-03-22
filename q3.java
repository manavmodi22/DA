import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class q3 {
    public static void main(String args[]) throws IOException {
        Scanner s =new Scanner(System.in);      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> stuff = new ArrayList<>();
        while (!input.equals("STOP!")) {
            stuff.add(input);
            input = br.readLine();
        }
        System.out.println(stuff.size());
        String temp="";
        int m=0;
        for (int i = 0; i < stuff.size(); i++){
            if (stuff.get(i).length()>m)
                {m= stuff.get(i).length();
                    temp = stuff.get(i);
                }
        }
        System.out.println(temp);
        System.out.println(m);
        s.close();
    
    }

}
