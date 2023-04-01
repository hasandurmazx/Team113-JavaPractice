package Day03_scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //      girilen bilgiler : M. Okumus, 22

        Scanner scan = new Scanner(System.in);

        // isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" + "\nHer bilgiden sonra ENTER'e basiniz");

        char isimIlkharf = scan.nextLine().charAt(0);

                /*
                Scanner Method'larinda nextChar() yok
                bunun icin once kullanicinin girisine gore next() veya nextline() yazip
                sonra .charAt(0) yazariz
                parantez icindeki 0 almak istedigimiz char'in index'idir
                ve java'da index 0'dan baslar

                 */

        String soyisim = scan.nextLine();
        double yas = scan.nextDouble();

        System.out.println("girilen bilgiler : " + isimIlkharf + ". " + soyisim + ", " + yas);
    }
}
