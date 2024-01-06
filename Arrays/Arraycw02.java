package Arrays;

import java.util.Scanner;

public class Arraycw02 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] array = new int[5];

                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter number " + (i+1) + ": ");
                    array[i] = scanner.nextInt();
                }

                for (int i = 0; i < 5; i++) {
                    if (array[i] % 2 == 0) {
                        System.out.println(array[i] + " is even.");
                    } else {
                        System.out.println(array[i] + " is odd.");
                    }
                }
            }
        }
