package Team113_Part1;

import java.util.Scanner;


public class Team113_prt1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin kacinci gunundeyiz...: ");

        int gunismi = scan.nextInt();

        switch (gunismi){

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Yanlis gun secimi");
                break;




        }


    }
}



