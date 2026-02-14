
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
            System.out.println("-----Switch case Example with Array Sorting----------");

            Scanner numbers= new Scanner(System.in);
            System.out.println("Enter the Number");


            int num = numbers.nextInt();
            int[] array = new int[num];
            switch(num)
            {
                case 1:
                    System.out.println("Your array size is 1 & We cannot process your array size");
                    break;
                case 2:
                    System.out.println("Your array size is 2 & We cannot process your array size");
                    break;
                case 3:
                    System.out.println("Your array size is 3 & We cannot process your array size");
                    break;  
                case 4:
                    System.out.println("Your array size is 4 & We cannot process your array size");
                    break;
                case 5:

                    System.out.println("Array size is: " + num);
                    if(num==5){
                        System.out.println("Now Enter the array elements");
        
            for (int i = 0; i < num; i++) {
                 array[i] = numbers.nextInt();   
            }
                System.out.println("Array elements are:");
                for( int i=0; i<num; i++){
                    System.out.print(array[i]+ " ");
                }
                    }

                    break;
                default:
                    System.out.println("Invalid input");
            }

            

    }
}


