package day12_forLoops;

import java.util.Scanner;

public class C03_forLoops {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degerini tam sayi olarak yazdirin");

        int bas = scan.nextInt();

        System.out.println("Bitis degrini tam sayi olarak yazdirin");

        int bit = scan.nextInt();

        int sayilarTopmali = 0;

        if (bas < bit) {

            for (int i = bas; i <= bit; i++) {
                sayilarTopmali += i;

            }
        } else { // baslangic degeri bitis degerinden buyuk

            for (int i = bas; i >= bit; i--) {
                sayilarTopmali += i;


            }
        }
        System.out.println("Sayilarin toplami : " + sayilarTopmali);
    }
}
