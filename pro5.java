//21CE019 Darshan Chavda
//Method overloading in java
//If a class has multiple methods having same name but different
//  in parameters, it is known as Method Overloading.
// If we have to perform only one operation, having same name of the
//  methods increases the readability of the program.

// Suppose you have to perform addition of the given numbers but 
// there can be any number of arguments, if you write the method 
// such as a(int,int) for two parameters, and b(int,int,int) for 
// three parameters then it may be difficult for you as well as 
// other programmers to understand the behavior of the method because 
// its name differs.
// we use a method overloading for following perposes
// 1) Method Overloading: changing no. of arguments
// 2) Method Overloading: changing data type of arguments
import java.util.*;

public class pro5 
{
        //For the changing the number of argument
        static int add(int a, int b)
        {
            return a + b;
        }
        static int add(int a, int b, int c)
        {
            return a + b + c;
        }
        
        //For changing a data type of arguments
        static int addition(int x, int y)
        {
            return x + y;
        }
        static double addition(double x, double y)
        {
            return x + y;
        }
}
class main5
{
    public static void main(String[] args) {
        System.out.println(pro5.add(5,10));
        System.out.println(pro5.add(10,20,30));

        System.out.println(pro5.addition(11,11));  
        System.out.println(pro5.addition(12.3,12.6));  
    }
}
