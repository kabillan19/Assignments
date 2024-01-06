package Java_Basics;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char input = scanner.next().charAt(0);

            String result = (input == 'a' ||   input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U')
                    ? "vowel" : "consonant";

            System.out.println("The entered character is a " + result);
    }
}
