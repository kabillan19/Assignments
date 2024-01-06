package Flow_of_Control;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        char option = (char)scan1.nextInt();
        switch (option){
            case 1:
                System.out.println("This is option 1");
                break;
            case 2:
                System.out.println("This is option 2");
                break;
        }
    }
}
