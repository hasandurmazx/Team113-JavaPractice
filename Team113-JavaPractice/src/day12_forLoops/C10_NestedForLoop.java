package day12_forLoops;

public class C10_NestedForLoop {

    public static void main(String[] args) {
        /*
                verilen satir sayisina gore
                 asagidaki sekli olusturan kod yaziniz

                *
                * *
                * * *
                * * * *
                * * * * *
                * * * * * *
                * * * * * * *
                * * * * * * * *
                * * * * * * * * *
                * * * * * * * * * *


         */
    int satir =10;
        for (int i = 1; i <satir ; i++) { // satirlar Outer loop / dis Dongu

            for (int j = 1; j <= i; j++) {  // sutunlar inner loop / Ic Dongu
                System.out.print("* ");

            }
            System.out.println("");


        }


    }




}
