package Day03_scanner_DataCasting;

public class C05_DataCasting {

    public static void main(String[] args) {

       /*
              Bazi primitive data turleri baska hic bir data turunden deger kabul etmez
             Bazi primitive data turleri ozel sartlar ile baska turdeki datalari deger olarak kabul eder

        */

        boolean bl= false;

        bl= true;

       // bl="true"; String

       // bl=20; int
       // bl='m' char

        char chr= 'm';

        chr='#';
        chr=' ';
        chr=99;

        int sayi1=20;

        short sayi2=15;

        double sayi3=72;

        sayi1=sayi2; // <=== short
        //sayi1=sayi3; int <=== double

        //sayi2=sayi1; short <== int
        //sayi2=sayi3; short <=== double

        sayi3=sayi1; // double <=== int
        sayi3=sayi2; // double <=== short

        sayi1=chr;
       //sayi2=chr;
        sayi3=chr;


    }
}
