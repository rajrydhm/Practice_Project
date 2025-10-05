package WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Wrapper Classes = Allow primitive values (int, double, char, boolean, etc..)
        //                  to be accessed as objects. "Wrap them in an object"
        //                  Generally, don't wrap primitives unless you need an object.
        //                  Allows use of Collections Framework and static utility methods.

        Integer a = new Integer(5);
        // Here we are assigning a value of 5 as argument to an Integer object "b" using an Integer constructor.
        // This is called boxing or wrapping, where a primitive value is converted into an object.

        //Java already has a built-in way to assign primitive values to variables
        int b = 5;

        //int a = 5 is faster and uses less memory than Integer b = new Integer(5);
        //But Integer b = new Integer(5) has methods that can be used on it, so there is still a use for it.
        //So java has also created an easier way assign primitive values to wrapper class objects.
        Integer c = 5; //autoboxing, new way of wrapping primitive in an object since Java 1.5 (2004)
        //This is called autoboxing, where the compiler automatically converts a primitive value into an object.

        //What could possibly c can do which b cannot do?

        // int d = null; cannot assign null values to primitives
        // Integer d = null; completely fine, under the hood its actually new Integer(null)
        // null value is needed when we are working with Databases.

        //Integer a = 100;
        //Integer b = 100;
        //System.out.println(a == b); // true only for small numbers due to caching
        //System.out.println(a.equals(b)); // always true

        //int x = 5;
        // x.toString(); // ❌ compile-time error
        //Integer y = x;
        //y.toString(); ✅ works

        //Performance optimization: knowing that using lots of wrappers is heavier than primitives.
        //Null safety: primitives cannot be null, wrappers can.
        //Correct comparisons: value vs reference issues with wrappers.
        //Understanding legacy code: pre-Java 5, autoboxing didn’t exist.

        System.out.println("----- Let's see some example -----");

        Integer w = new Integer(123); // you can see the warning from Java regarding this old usage.
        Double x = new Double(3.14);
        Character y = new Character('#');
        Boolean z = new Boolean(true);

        //Autoboxing

        Integer o = 123; //Please be aware, these are not same as int o = 123
        Double p = 3.14;
        Character q = '$';
        Boolean r = true;
        String s = "Pizza"; //Strings were always been acting as Objects, that's why we could do s.length(), s.substring(), etc

        System.out.println(o.toString().length());

        int t = 456;
        //System.out.println(t.toString().length()); ❌ compile-time error

    }
}
