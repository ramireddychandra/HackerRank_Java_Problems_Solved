

import java.io.IOException;
import java.lang.reflect.Method;

class Printer<t>
{
    public static <t> void printArray(t[] array)
    {
        for(t data:array)
        {
            System.out.println(data);
        }
        // return array;
    }
   //Write your code here
 
}

public class $28javaGenerics {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}