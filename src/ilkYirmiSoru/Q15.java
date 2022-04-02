package ilkYirmiSoru;

import java.util.Arrays;
import java.util.Random;

public class Q15 {
    public static void main(String[] args) {
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][3];
        int[][] toplam=new int[3][3];
        Random rnd=new Random();
        System.out.println("M1 Matrisi");

        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j < m1.length; j++) {
                m1[i][j] =rnd.nextInt(5);
                System.out.print(m1[i][j]+" ");
            }
            System.out.println("");


        }System.out.println("M2 Matrisi");
        for (int i = 0; i <m2.length ; i++) {
            for (int j = 0; j < m2.length; j++) {
                m2[i][j] =rnd.nextInt(5);
                System.out.print(m2[i][j]+" ");

            } System.out.println("");
        }
        System.out.println("Toplam Matrisi");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                toplam[i][j]=m1[i][j]+m2[i][j];
                System.out.print(toplam[i][j]+" ");
            }
            System.out.println(" ");
        }



    }
}
