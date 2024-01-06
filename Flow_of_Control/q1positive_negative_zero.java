package Flow_of_Control;

import java.util.Scanner;

public class q1positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number is positive !");
        }
        else if (num < 0) {
            System.out.println("The number is negative !");
        }
        else if (num == 0 ){
            System.out.println("The number is ZERO !!");
        }
    }
}
