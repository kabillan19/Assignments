package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[8];
        for (int i=0; i<8; i++) {
            System.out.println("Enter your "+ (i+1) + " letter in name ");
            names[i] = scan.next();
        }
        System.out.println(Arrays.toString(names));
    }
}
