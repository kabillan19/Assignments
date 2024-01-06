package Flow_of_Control;

import java.util.Scanner;

public class q2Leapyear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int lyear = year.nextInt();
        if (lyear % 4 == 0)
        {
            if (lyear % 100 != 0) {System.out.println("This is leap year");}
        }
        else if ((lyear % 400) == 0){System.out.println("This is Leap Year");}
        else {System.out.println("This is not leap year");}

        }
    }

