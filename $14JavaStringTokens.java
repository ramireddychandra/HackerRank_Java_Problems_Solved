import java.io.*;
import java.util.*;

public class $14JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        if(!scan.hasNext())
        {
            System.out.println(0);
            
        }
        else{
            String s = scan.nextLine();
            String list[] = s.trim().split("[ !,?._'@]+");
            ArrayList<String> al = new ArrayList<String>(Arrays.asList(list));
            
            System.out.println(al.size());
            for(String sub: al)
            {
                System.out.println(sub);
            }
        }
    }
}

