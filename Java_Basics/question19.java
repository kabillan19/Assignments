package Java_Basics;

import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {


            Scanner numb1 = new Scanner(System.in);
            System.out.println("Please enter a number 1 : ");
            int a = numb1.nextInt();
            Scanner numb2 = new Scanner(System.in);
            System.out.println("Please enter a number 2 : ");
            int b = numb2.nextInt();
            Scanner numb3 = new Scanner(System.in);
            System.out.println("Please enter a number 3 : ");
            int c = numb3.nextInt();
            int max1 = a > b ? a : b;
            int max = max1 > c ? max1 : c;
            System.out.println(max);


        }
    }
