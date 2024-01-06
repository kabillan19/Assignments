package labassignment;

import java.util.Scanner;

public class labassignment01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = scan.next();
        int len = input.length();
        if (len % 2 != 0){
            System.out.println(input + "0");
        }
        else {
            System.out.println(input);
        }
    }
}
