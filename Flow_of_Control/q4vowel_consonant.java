package Flow_of_Control;

import java.util.Scanner;

public class q4vowel_consonant {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a character: ");
                char ch = scanner.next().charAt(0);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        System.out.println(ch + " is a vowel.");
                    }
                    else {
                        System.out.println(ch + " is a consonant.");
                    }
    }
}
