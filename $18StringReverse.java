import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = false;
        for(int i=0,j=A.length()-1;i<=j;i++,j--)
        {
            // System.out.println(A.charAt(i)+" "+ A.charAt(j));
            if(A.charAt(i)!=A.charAt(j))
            {
                flag = false;
            }
            else{
                flag = true;
            }
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



