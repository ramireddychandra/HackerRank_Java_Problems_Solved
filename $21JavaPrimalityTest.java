import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class $21JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       BigInteger n = sc.nextBigInteger();
       if(n.isProbablePrime(1))
       {
           System.out.println("prime");
       }
       else{
           System.out.println("not prime");
       }
    }
}
