package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_ifStatements {

    public static void main(String[] args) {

        /*
        Kullanicidan notunu alin
        50 veya daha buyukse "Sinifi gectin"
        50'den kucukse "Malesef kaldin"
         */

        /*
        If statements'te sart parantezinden sonra suslu parantez kullanmazsak
        Java ilk ;'e kadar olan kismi if body olarak kabul eder

            if body zaten bir satir ise bu bir sorun olmaz
            ama if body bir satirdan coksa ilk satirdan sonrasi her durumda calisir
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not>=50 && not<=100) {

            System.out.println("Sinifi gectin");

            System.out.println("kontrol1");
            System.out.println("kontrol2");
            System.out.println("kontrol3");
        }



        if (not<50)
            System.out.println("Maalesef kaldin");
            }
        }




