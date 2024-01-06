package Java_Basics;

import java.util.Scanner;

public class question31 {
    public static void main(String[] args) {

        Scanner i1 = new Scanner(System.in);
        System.out.println("Integer Input : ");
        int input1 = i1.nextInt();

        Scanner i2 = new Scanner(System.in);
        System.out.println("Double Input : ");
        double input2 = i2.nextDouble();

        Scanner i3 = new Scanner(System.in);
        System.out.println("String input : ");
        String input3 = i3.nextLine();

        System.out.println("Integer = " + input1);
        System.out.println("Double = " + input2);
        System.out.println("String = " + input3);
    }
}
