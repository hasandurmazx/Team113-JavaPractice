package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_Ifstatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        /*
        Javada 3 lu karsilastirma yoktur
        Onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz
         */

        if (kenar1 ==kenar2 &&  kenar1 == kenar3){

            System.out.println("Girilen kenarlar bir eskenar ucgendir");
        }




    }
}
