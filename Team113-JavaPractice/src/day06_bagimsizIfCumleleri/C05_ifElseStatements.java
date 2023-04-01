package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_ifElseStatements {

    public static void main(String[] args) {
         /*
         Eger bir olay icin
         sadece 2 olasilik var ise ve bu olasiliklardan birisi mutlaka calisacaksa
         if Else Statements kullaniriz

         If-else Statement'da if body'si veya else body' si mutlaka calisir
         ikisinin birden calisma ihtimali YOKTUR
         ikisininde  calismama ihtimali YOKTUR
          */
        /*
        Kullanicidan notunu alin
        50 veya daha buyukse "Sinifi gectin"
        50'den kucukse "Malesef kaldin"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {

            System.out.println("Sinifi gectin");

        } else {
            System.out.println("Malesef kaldin");

            // Kullanicidan bir tam pozitif sayi alin
            // Sayinin cift veya tek sayi  oldugunu yazdirin

            System.out.println("Pozitif bir tam sayi giriniz");

            int sayi = scan.nextInt();

            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cifttir");
            } else {
                System.out.println("Girilen sayi tek");
            }

            // Kullanicidan bir tam sayi alin
            // 5 ile bolunup bolunmedigini yazdirin

            if (sayi % 5 == 0) {
                System.out.println("5 ile tam bolunebilir");
            } else {
                System.out.println("5 ile tam olarak bolunemez");

            }

        }
    }
}



