import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class $20TagsContentExtractor{
	public static void main(String[] args){
        
		String regex = "<(.+)>([^>]+)</\\1>";
        Pattern p = Pattern.compile(regex);
        Scanner sc= new Scanner(System.in);
        int TestCases = Integer.parseInt(sc.nextLine());
        
        while(TestCases> 0)
        {
            boolean flag = true;
            String input = sc.nextLine();
            Matcher m = p.matcher(input);
            while(m.find())
            {
                System.out.println(m.group(2));
                flag = false;
            }
            if(flag)
            {
                System.out.println("None");
            }
            TestCases--;
        }
        sc.close();
	}
}



