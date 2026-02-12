
import java.util.Scanner;



public class Main {
    public static void main (String [] args){
      
      System.out.println("--------Area of Circcle--------");
       double pi=3.1416;
       double area, radius;
       
       System.out.println("Enter the radius of the circle: ");
       Scanner r= new Scanner(System.in);
       radius = r.nextDouble();
       area= pi * radius * radius;


       System.out.printf("The area of the circle is: %.2f",area);



       


        


    }
}
