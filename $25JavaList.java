import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class $25javaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        int querynum = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<querynum;i++)
        {
            String querytype = sc.nextLine();
            if(querytype.equals("Insert"))
            {
                String query[] = sc.nextLine().split(" ");
                al.add(Integer.parseInt(query[0]),Integer.parseInt(query[1]));
            }
            else{
                int x = Integer.parseInt(sc.nextLine());
                al.remove(x);
            }
        }
        for(int val :al )
        {
            System.out.print(val+" ");
        }
        
        
        
    }
}