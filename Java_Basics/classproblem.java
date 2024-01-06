package Java_Basics;

import java.util.Scanner;

public class classproblem {
    public static void main(String[] args) {
        Scanner fp = new Scanner(System.in);
        System.out.println("Please enter your age for first person :  ");
        int age1 = fp.nextInt();
        System.out.println((age1>= 18)? " You are eligible" : "You are not eligible ");
    }
}
