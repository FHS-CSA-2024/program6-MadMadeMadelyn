//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[]args){
        double pi = 3.14;
        double r = 0;
        double circumference = 2*pi*r;
        circumference = circumference*1000;
        circumference = (double) ((int)circumference);
        circumference = circumference/1000;
        double diameter = 2*r;
        diameter = diameter*1000;
        diameter = (double) ((int)diamter);
        diameter = diameter/1000;
        double area = pi*r*r;
        area = area*1000;
        area = (double) ((int)area);
        area = area/1000;
        
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
