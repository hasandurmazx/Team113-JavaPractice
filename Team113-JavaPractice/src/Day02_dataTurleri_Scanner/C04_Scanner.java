package Day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

       // 1.adim : scanner objesi olusturun

        Scanner scan= new Scanner(System.in);

        // 2.adim : kullaniciya ne istediginizi yazdirin

        System.out.println("Lutfen isminizi giriniz");

        // 3.adim : Girilen bilgiyi icine koyabileceginiz bir variable olusturun
        //          olusturudugumuz Scanner objesi ile uygun method'u kullanarak bilgiyi alin

        String isim = scan.nextLine();

        System.out.println("Girilen isim : " + isim);
    }
}
