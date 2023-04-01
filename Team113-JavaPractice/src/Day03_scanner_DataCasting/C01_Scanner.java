package Day03_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatte yazdirin
        //      Isminiz : Mehmet Sah
        //      Soyisminiz : Okumus
        //      Yasiniz : 22
        //      Kaydiniz Basariyla Tamamlanmistir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");


        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();

        System.out.println("Isminiz : "+ isim +
                           "\nSoyisminiz : " + soyisim +
                           "\nYasiniz : " + yas +
                           "\nKaydiniz Basariyla Tamamlanmistir");

        // Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // Kodumuzdsa hata olusur ve calisma durur
        // Ilerde Kullanici hatalarina karsi nasil tedbirler olacagimizi ogrenecegiz
        // SIMDILIK kullanici biz ne diyorsak onu tam yapiyor kabul edelim

        /*
        Tek bir System.out.println(); ile birden fazla satir yazdirmak isterseniz
        String bir ifadenin icinde istedigimiz yere \n yazabilirsiniz
         */




    }
}
