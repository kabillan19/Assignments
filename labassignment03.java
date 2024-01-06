package labassignment;
import java.util.Scanner;

public class labassignment03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string A:");
                String A = scanner.next();

                System.out.println("Enter string B:");
                String B = scanner.next();

                int lengthSum = A.length() + B.length();
                System.out.println("length of string a and b : " + lengthSum);

                int comparisonResult = A.compareTo(B);
                if (comparisonResult > 0) {
                    System.out.println("YES");
                } else if (comparisonResult < 0) {
                    System.out.println("NO");
                }

                A = A.substring(0, 1).toUpperCase() + A.substring(1);
                B = B.substring(0, 1).toUpperCase() + B.substring(1);
                System.out.println(A);
                System.out.println(B);

            }
        }