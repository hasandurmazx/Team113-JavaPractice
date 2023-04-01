package Day04_DataCasting_WrapperClass;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tam sayi giriniz");

        int girilensayi = scan.nextInt(); // 546

        int rakam = girilensayi % 10;

        int rakamlartoplami = rakam;

        girilensayi = girilensayi / 10;

        rakam = girilensayi % 10;

        rakamlartoplami = rakamlartoplami + rakam;

        girilensayi = girilensayi / 10;

        rakam = girilensayi % 10;

        rakamlartoplami=rakamlartoplami+rakam;

        System.out.println("Girilen sayinin rakamlar toplami : " +rakamlartoplami); // 15





    }
}
