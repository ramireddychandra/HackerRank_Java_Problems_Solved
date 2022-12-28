import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class $23JavaSubStringNegitiveArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int data=0,sum=0;
        int n = sc.nextInt();
        int a[] = new int[n];
        int sumofneg = 0;
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j =i;j<n;j++)
            {
                int sum=0;
                for(int k = i;k<=j;k++)
                {
                    sum+=a[k];
                }
                if(sum<0)
                {
                    sumofneg++;
                }
            }
        }
        System.out.println(sumofneg);
    }
}
