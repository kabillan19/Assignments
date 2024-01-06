package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] name = new String[10];
        for (int i=0;i<10;i++){
            System.out.println("Enter your Name : ");
            name[i] = scan.next();
        }
        System.out.println(Arrays.toString(name));
    }
}
