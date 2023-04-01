package Day15_doWhıleLoop_Scope;

import java.util.Scanner;

public class C01_WhıleLoop_RakamlarınToplamıBulma {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("rakamları toplanacak pozitif tam sayı gırınız");
        int girilensayı= scan.nextInt();
        int sayi = girilensayı;
        int birlerBasamgı=0;
        int rakamlarToplamı=0;

        while (sayi>0){


            birlerBasamgı= sayi%10;
            rakamlarToplamı += birlerBasamgı;

            sayi /=10;
        }



        System.out.println("girilen"+girilensayı+"nın rakamlar toplamı :" + rakamlarToplamı);




    }







}
