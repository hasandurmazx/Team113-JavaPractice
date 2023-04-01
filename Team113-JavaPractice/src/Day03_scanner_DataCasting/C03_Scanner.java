package Day03_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //  Kullanicidan bir cemberin yari capini alin, cevrasini ve alanini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini girin");

        // Kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun
        // Kullanicidan bilgiyi almak icin Scan objesini ve ilgili next method'unu kullanin

        double yaricap = scan.nextDouble();

        // cevresini ve  alanini yazdirin.

        System.out.println("Cemberin cevresi : " + 2* 3.14 * yaricap);

        System.out.println("Dairenin alani : "+ 3.14 * yaricap*yaricap);

    }
}
