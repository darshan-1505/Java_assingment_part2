// 21CE019-Darshan Chavda
// (1) Design a class named Circle containing following attributes and behavior.
// • One double data field named radius. The default value is 1.
// • A no-argument constructor that creates a default circle.
// • A Single argument constructor that creates a Circle with the specified radius.
// • A method named getArea() that returns area of the Circle.
// • A method named getPerimeter() that returns perimeter of it.
import java.util.*;
class Circle
{
    double radius;
    double area, perimeter;
    Circle()
    {
        radius = 1;
    }
    Circle(double r)
    {
        radius = r;
    }
    void getArea()
    {
        area = 3.14 * radius * radius;
        System.out.println(area);
    }
    void getPerimeter()
    {
        perimeter = 2 * 3.14 * radius;
        System.out.println(perimeter);
    }
}
public class pro1 extends Circle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double r1;
        // for the defult constructor
        // Circle c1 =new Circle();
        // c1.getArea();
        // c1.getPerimeter();
        
        System.out.println("Enter the radius of a circle : ");
        r1 = sc.nextDouble();
       
        Circle c2 = new Circle(r1);
        

        c2.getArea();
        c2.getPerimeter();

    }
}

