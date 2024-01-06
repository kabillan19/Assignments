package Arrays;

import java.util.Scanner;

public class program2hw {
    public static void main(String[] args) {
        //create a char type array and take 10 characters and print only vowels
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 characters:");
        char[] charArray = new char[10];
        for (int i = 0; i < 10; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        for (char i : charArray) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                  System.out.println(i);
                 }
            }
        }
}