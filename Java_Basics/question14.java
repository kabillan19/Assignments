package Java_Basics;

import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number :  ");
        int numberint = number.nextInt();
        System.out.println((numberint>=0)?"Positive Number":"Negative Number");
    }
}
