package Java_Basics;

public class Arithmatic_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int sum = a + b , diff = a-b , product = a*b ,  remainder = a%b , quotient = a/b ;
        String Ans = String.format("Sum is %d Difference is %d Product is %d remainder is %d quotient is %d ",sum,diff,product,remainder,quotient);
        System.out.println(Ans);
    }
}

