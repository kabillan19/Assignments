package Flow_of_Control;
import java.util.Scanner;

public class loginlogic2 {

    public static void main(String[] args) {
        String correctUsername = "user123";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        if (correctUsername.equals(enteredUsername)) {

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (correctPassword.equals(enteredPassword)) {
                System.out.println("Login successful. Welcome, " + enteredUsername + "!");
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        }
        else {
            System.out.println("Invalid username. Please try again.");
        }
    }
}
