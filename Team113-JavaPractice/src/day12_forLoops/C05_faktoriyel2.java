package day12_forLoops;

public class C05_faktoriyel2 {

    public static void main(String[] args) {
        //      Kullanicidan 20'den kucuk bir sayi alip,
        //      bu sayinin faktoriyel degerini hesaplayin. Konsolda faktoriyel hesabinin yapilisini da yazdirin.
        //       for ex : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        double sayi = 10;
        double faktoriyel = 1;

        System.out.print("10! = ");
        for (double i = sayi; i >= 1; i--) {

            faktoriyel *= i;

            if (i!=1) {
                System.out.print(i + " * ");
            }else {
                System.out.print(i + " ");



            }

        }
        System.out.println("= " + faktoriyel);
    }
}
