package Flow_of_Control;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
