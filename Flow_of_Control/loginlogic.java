package Flow_of_Control;

import java.util.Scanner;

public class loginlogic {
    public static void main(String[] args) {
        String uscred  = "Kabillan19";
        String pwdcred = "higuys";
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the username :");
        String usrname = scan1.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Password:");
        String pwd = scan2.nextLine();
        if(usrname .equalsIgnoreCase(uscred)){
            if(pwd.equalsIgnoreCase(pwdcred)){
                System.out.println("You are Logged in !!");
            }
            else {
                System.out.println("Invalid Password !");
            }
        }
        else {
            System.out.println("Invalid Username ");
        }

    }
}
