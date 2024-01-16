package labassignment;

import java.util.Scanner;

public class labassignment08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Even multiples of " + num + " up to its square:");

            for (int i = 0; i <= num * num; i++) {
                if (i%2==0 && i%num==0) {
                    System.out.println(i);
                }
            }
        }
    }

