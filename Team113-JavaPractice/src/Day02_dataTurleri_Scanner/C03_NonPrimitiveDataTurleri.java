package Day02_dataTurleri_Scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String isim= "Ali Can";

        String ilkHarf="K";
        char ilkHarf2 = 'm';

        // Tek bir karakter atayacaksak ikisinide kullanabiliriz

        System.out.println(ilkHarf.toLowerCase()); // k
        System.out.println(ilkHarf2);

        // primitive data turundeki variable'lar sadece DEGER tasiyabilir
        // non-primitive data turundeki variable'larin hem deger hem de method'lari olur

        String metin= "dflgjmdfklgbmfdsklmgklsadmfbklsdmfb" +
                "dslfgkfdslgpkdl[fgmkladgmkaokdg" +
                "askldjsaoidgfjsaodfgjasopdgjasiodgtf" +
                "kASDGjmoksaPDgjiasdgjmioasdfgozdofg" +
                "Sdgasdfgomkadsfgoadofhgadopfhkoa" +
                "ALSFDgmolaFGMOADFOHGMKADOFH;SFKG;;DFLG;DFGL";

        System.out.println(metin);

        String not = "not";
        String Not = "Variable isimlerinin buyuk harf ile baslamasi tavsiye edilmez ama java kabul eder";
        String noT = "Bir kere deklare edilen variable tekrar deklare edilemez";
        String nOT = "Ama isimler farkli sekilde yazildigi icin java bunlari farkli variable olarak kabul eder";

        // CamelCAse : kucuk harfle baslar, sonraki kelimeler bitisik yazilir ve ilk harfi buyuk olur
        // ilkHarf, ogrneciNo, okulDefteriDolabi
        //   naming convention
    }
}
