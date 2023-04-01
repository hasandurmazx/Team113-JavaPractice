package day12_forLoops;

public class C04_faktoriYel {

    public static void main(String[] args) {

        // Kullanicidan 20'den kucuk bir sayi alip,
        // bu sayinin faktoriyel degerini hesaplayin.

        int sayi =5;

        int faktoriyel=1;

        for (int i =sayi; i >=1 ; i--) {

            faktoriyel*=i;


        }
        System.out.println(sayi + "! = " + faktoriyel);


    }
}
