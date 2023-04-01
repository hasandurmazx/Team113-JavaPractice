package Day02_dataTurleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilk_Harf= ' '; // tek tirnak icerisinde tek karakter (harf, sayi, ozel karakter, bosluk ...)

        byte Ogryasi=21; // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir
        short ogryasi=21;
        int ogrYasi= 21;
        long OgrYasi=21;

        double sayi1=3.123456789123456789;
        System.out.println(sayi1); // 3.123456789123457

        // double virgulden sonra 16 hane yazdirir, ama cok kucuk  sayilara indigi icin
        // ondalikli kismin sonunda hatalar olabilir
        // 15 /3 = 4.999999999999 or 5.0 or 5.000000000001

        float sayi2= 45.12345676756747465799568f;
        // float sayi tanimladigimizda doubleden farkli oldugunu belirtmek icin sonuna F veya f yazmak zorundayiz

        System.out.println(sayi2);  // 45.123455

        // biz dersler boyunca hafiza onemli olmadigi icin
        // tamsayilar icin int, ondalikli sayilar icin de double kullaniriz




    }
}
