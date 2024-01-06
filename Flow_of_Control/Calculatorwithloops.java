package Flow_of_Control;

import java.util.Scanner;

public class Calculatorwithloops {
    public static void main(String[] args) {
        Scanner i1 = new Scanner(System.in);
        System.out.println("Enter your First Number : ");
        int input1 = i1.nextInt();

        Scanner i2 = new Scanner(System.in);
        System.out.println("Enter your Second Number : ");
        int input2 = i2.nextInt();

        int option;
        do {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Choose \n 1 for Addition \n 2 for Subraction \n 3 for Multipliaction \n 4 for Division ");
            option = scan1.nextInt();

            switch (option){
                case 1 :
                    System.out.println("The Answer is " + (input1+input2));
                    break;
                case 2 :
                    System.out.println("The Answer is " + (input1-input2));
                    break;
                case 3 :
                    System.out.println("The Answer is " + (input1*input2));
                    break;
                case 4:
                    System.out.println("The Answer is " + (input1/input2));
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 4.");
            }
        } while (option < 1 || option > 4);
    }
}
