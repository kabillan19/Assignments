package oops;

public class calci {
    String add(int a, int b){
        return "The ans is  " + (a+b);
    }
    String sub(int c, int d){
        return "The ans is  " + (c-d);
    }
    String multiply(int e, int f){
        return "The ans is  " + (e*f);
    }
    String divide(int g, int h){
        return "The ans is  " + (g/h);
    }

    public static void main(String[] args) {
        calci cal = new calci();
        System.out.println(cal.add(10,5));
        System.out.println(cal.sub(12,32));
        System.out.println(cal.multiply(12,43));
        System.out.println(cal.divide(10,5));
    }
}
