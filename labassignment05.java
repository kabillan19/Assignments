package labassignment;

import java.util.Scanner;

public class labassignment05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();
        if (input > 0) {
            if (input < 1) {
                System.out.println("Small");
            } else if (input > 1000000) {
                System.out.println("Large");
            } else {
                System.out.println("Positive Number");
            }
        }
        else if (input < 0 ) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
