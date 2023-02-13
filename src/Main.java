import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //domaci - izvuci max i min vrednost niza
        //ispisati 2d niz kroz duplu for petlju

        //array
        int niz[] = new int[3];
        niz[0] = 5;
        niz[1] = 2;
        niz[2] = 4;
        //niz[3] = 12;//

        //System.out.println(niz[1]);


        for (int i = 0; i < niz.length; i++) {
            System.out.println("Index " + i + " Vrednost clana: " + niz[i]);
            if (niz[i] == 4){
                System.out.println(i);
            }
        }

//        System.out.println(Arrays.toString(niz));

        System.out.println("------------------------------");

        int [] mojNiz = {55, 67, -20, 0, 88};

//        for (int n : mojNiz) {
//            System.out.println(n);
//        }

//        System.out.println("------------------------------");
//
//
//        System.out.println(mojNiz);


        int [][] niz2d = new int[][]{{1,2,8}, {3,4,10}, {5,6,15}};
        System.out.println("Duzina niza: " + niz2d.length);

        System.out.println(niz2d[1][2]);


        int [] niz1d = {55, 67, -20, 0, 88};



        for (int [] a : niz2d) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }





    }





}