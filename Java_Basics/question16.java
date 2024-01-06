package Java_Basics;

import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a year: ");
          int year = scanner.nextInt();


        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap year" : "Not a leap year";
        System.out.println(year + " is " + result);

     }
}