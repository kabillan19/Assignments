package Java_Basics;

public class TernaryOperator {
    public static void main(String[] args) {
        String name1 = "kabillan";
        int length1 = name1.length();
        String name2 = "john";
        int length2 = name2.length();
        System.out.println((length1 > length2) ? name1 : name2);

    }
}
