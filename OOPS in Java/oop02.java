package oops;

public class oop02 {
    String call() {
        return "Coming Sir";
    }

    String bark() {
        return "bhaw bhaw";
    }
}
     class human {
         String speak() {
             return "Hello";
         }

         String Who_are_you() {
             return "I am human";
         }



    public static void main(String[] args) {
       human humans=new human();
       oop02 dog=new oop02();
        System.out.println(dog.bark());
        System.out.println(dog.call());
        System.out.println(humans.speak());
        System.out.println(humans.Who_are_you());
    }
}

