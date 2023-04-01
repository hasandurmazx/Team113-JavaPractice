package day12_forLoops;

public class C02_ForLoops {

    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int bas = 50;
        int bit = 100;

        int sayitoplami = 0;

        if (bit < bas) {
            System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
        } else {
            for (int i = bas; i <= bit ; i++) {
                // sayitoplami = sayitoplami +1;

                sayitoplami +=i;

            }
        }

        System.out.println("Sayilarin toplami : " + sayitoplami);


    }
}

