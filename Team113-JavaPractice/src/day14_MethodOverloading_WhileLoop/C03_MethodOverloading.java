package day14_MethodOverloading_WhileLoop;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        /*
            Bir class'ta ayni isme sahip
            farkli isim yapan method'lar olabilir
            Java bu method'lardan hangisinin calisacagina
         parametrelere gore karar verir

         Bir class'ta ayni, parametreleri farkli method'lar olmasina
         method OVERLOADING denir.
         */


        String str = "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak


        System.out.println(str.replace('u','e')); // Be is olacak

    }
}
