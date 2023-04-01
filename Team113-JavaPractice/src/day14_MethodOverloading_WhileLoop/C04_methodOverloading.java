package day14_MethodOverloading_WhileLoop;

public class C04_methodOverloading {

    public static void main(String[] args) {
        topla(6,8);
        topla(2.3,5.4);

    }

    public static void topla(int a, int b){

        System.out.println("iki tam sayinin toplami : " +(a+b)); // iki tam sayinin toplami : 14

    }
    public static void topla(double a, double b){
        System.out.println("iki double sayinin toplami : " +(a+b)); //iki double sayinin toplami : 7.7


    }

    }
