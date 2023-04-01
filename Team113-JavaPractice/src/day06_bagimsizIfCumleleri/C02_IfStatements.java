package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin
        // sayiyi kontrol edip 5 ile bolunuyorsa "sayi 5'in tam kati" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%5==0){

            System.out.println("sayi 5'in tam kati");
        }

        if (sayi%3==0){

            System.out.println("UC ile bolunebilen sayi");
        }
    }
}
