package labassignment;

import java.util.Scanner;

public class labassignment09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] numbers = new int[6];
            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = sc.nextInt();
            }
            System.out.println("Values at even indexes:");
            for (int i = 2; i < numbers.length; i += 2) {
                System.out.print(numbers[i] + " ");

            }
        }
    }
