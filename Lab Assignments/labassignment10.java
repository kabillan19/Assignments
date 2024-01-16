package labassignment;
import java.util.Scanner;
public class labassignment10 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (1-4): ");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Good Morning");
                    break;
                case 2:
                    System.out.println("Good Afternoon");
                    break;
                case 3:
                    System.out.println("Good Evening");
                    break;
                case 4:
                    System.out.println("Good Night");
                    break;
                default:
                    System.out.println("Invalid");
            }

        }
    }


