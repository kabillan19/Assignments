package Arrays;

import java.util.Scanner;

public class Arraycw03 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] Nums = new int[5];
                int[] squareNums = new int[5];

                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter number " + (i+1) + ": ");
                    Nums[i] = scanner.nextInt();
                    squareNums[i] = Nums[i] * Nums[i];
                }

                System.out.println("The squares of the numbers are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(squareNums[i]);
        }

        }
    }

