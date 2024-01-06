package Flow_of_Control;

import java.util.Scanner;

public class choosing_operation {
    public static void main(String[] args) {
        Scanner i1 = new Scanner(System.in);
        System.out.println("Enter your First Number : ");
        int input1 = i1.nextInt();

        Scanner i2 = new Scanner(System.in);
        System.out.println("Enter your Second Number : ");
        int input2 = i2.nextInt();

        Scanner i3 = new Scanner(System.in);
        System.out.println("Choose \n 1 for Addition \n 2 for Subraction \n 3 for Multipliaction \n 4 for Division ");
        int input3 = i3.nextInt();

        if (input3 == 1){
            System.out.println("The Answer is" + input1+input2);
        }
        else if (input3 == 2){
            System.out.println("The Answer is" + (input1-input2));
        }
        else if (input3 == 3){
            System.out.println("The Answer is" + (input1*input2));
        }
        else if (input3 == 4){
            System.out.println("The Answer is" + (input1/input2));
        }
        else {
            System.out.println("Please choose valid operation");
        }
    }
}
