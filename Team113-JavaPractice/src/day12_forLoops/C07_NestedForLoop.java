package day12_forLoops;

public class C07_NestedForLoop {

    public static void main(String[] args) {

        // verilen bir rakam icin carpim tablosu olusturun

        int rakam = 1000000000;
        /*
                1 2  3  4  ==> 1*1 1*2 1*3 1*4 
                2 4  6  8  ==> 1*2 2*2 2*3 2*4 
                3 6  9 12  ==> 1*3 2*3 3*3 3*4 
                4 8 12 16  ==> 1*4 4*2 4*3 4*4 
                
         */
        for (int i = 1; i <= rakam; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");
        for (int i = 1; i <= rakam; i++) {
            System.out.print(2 * i + " ");


        }
        System.out.println("");
        for (int i = 1; i <= rakam; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println("");
        for (int i = 1; i <= rakam; i++) {
            System.out.print(9 * i + " ");

        }

        System.out.println();
        System.out.println("=======================");

        for (int i = 1; i <= rakam; i++) {   // satirlar

            for (int j = 1; j <= rakam; j++) {
                System.out.print(i*j+ " ");

            }
            System.out.println("");
        }
    }
}
