//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[]args){
        double pi = 3.14;
        double r = 0;
        double circumference = 2*pi*r;
        double diameter = 2*r;
        double area = pi*r*r;
        
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = numScanner.nextInt();
        
        System.out.println("The Radius of the circle = " + r);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
    }
}
//Paste console output below:
/*


*/
