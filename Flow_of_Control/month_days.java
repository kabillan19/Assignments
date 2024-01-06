package Flow_of_Control;
import java.util.Scanner;
public class month_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = scanner.nextLine().toLowerCase();

        switch (month) {

            case "january": case "march": case "may": case "july": case "august": case "october": case "december":
                System.out.println("The month " + month + " has 31 days.");
                break;

            case "april": case "june": case "september": case "november":
                System.out.println("The month " + month + " has 30 days.");
                break;

            case "february":
                System.out.println("The month February can have 28 or 29 days.");
                break;

            default:
                System.out.println("Invalid input. Please enter a valid month.");
        }
    }
}
