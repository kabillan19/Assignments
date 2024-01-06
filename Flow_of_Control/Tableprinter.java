package Flow_of_Control;

import java.util.Scanner;

public class Tableprinter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num1 = sc.nextInt();
        for (int a=1 ; a<=10 ; a++) {
            int c = a*num1;
            if(c%2==0){
                System.out.println(a+"*"+ num1 + " = " +c);
                 }
            }
        }
    }

