package Flow_of_Control;

import java.util.Scanner;

public class q5electricbill {
    public static void main(String[] args) {
        Scanner scunit = new Scanner(System.in);
        System.out.println("Please enter the Units Consumed");
        float units = scunit.nextFloat();
        if(units <= 100 & units > 0){
            System.out.println("The value of your Electricity bill is " + units*(1.50));
        }
        else if (units > 100 & units <= 200 ){
            System.out.println("The value of your Electricity bill is " + units*(2));
        }
        else{
            System.out.println("The value of your Electricity bill is " + units*(2.50));
        }
    }
}
