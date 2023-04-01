package day12_forLoops;

public class C08_NestedForLoop {

    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
         * * * * * *
         * * * * * *
         * * * * * *
         */
        int SatirSayisi = 3;
        int SutunSayisi = 5;

        for (int k = 1; k <= SatirSayisi; k++) { // satir sayisini
            for (int i = 1; i <= SutunSayisi; i++) {  // sutun sayisi
                System.out.print("* ");

            }
            System.out.println(""); // bir satirdaki tum sutunlar bitince alt satira geciyor
        }

        System.out.println("=======================");

        for (int i = 1; i <=SatirSayisi ; i++) {
            for (int j = 1; j <= SutunSayisi; j++) {

                System.out.print("* ");
            }
            System.out.println("");

        }


        }



    }





