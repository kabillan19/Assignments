package labassignment;

import java.util.Scanner;

public class labassignment07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double x = scan.nextDouble();
        System.out.println("Enter the second number");
        double y = scan.nextDouble();
        System.out.println("Enter the third number");
        double z = scan.nextDouble();
        if (x<y && y<z){
            System.out.println("Increasing Order");
        }
        else if (x>y && y>z){
            System.out.println("Decreasing Order");
        }
        else {
            System.out.println("Neither Increasing nor Decreasing ");
        }

    }
}
