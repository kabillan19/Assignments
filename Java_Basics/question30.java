package Java_Basics;

import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner fname = new Scanner(System.in);
        System.out.print("Enter your First name : ");
        String n1 = fname.nextLine();
        Scanner sname = new Scanner(System.in);
        System.out.print("Enter your First name : ");
        String n2 = sname.nextLine();
        String name = n1 + " "+ n2 ;
        System.out.println(name);

    }
}
