//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[]args){
        double pi = 3.14159;
        double r = 0;
        
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = numScanner.nextDouble();

        double circumference = 2*pi*r;
        double diameter = 2*r;
        double area = pi*r*r;
        
        System.out.println("The Radius of the circle = " + r);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + String.format("%.3f", area));
        System.out.println("The Circumference of the circle = " + String.format("%.3f",circumference));
    }
}
//Paste console output below:
/*


*/
