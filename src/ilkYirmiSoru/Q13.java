package ilkYirmiSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("dizideki eleman sayisini giriniz : ");

        int sayiAdedi=scan.nextInt();

       int arr[]=new int[sayiAdedi];


        for (int i = 0; i <sayiAdedi; i++) {
            System.out.print("lutfen "+(i+1)+". sayiyi giriniz : ");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int sayilarToplami=0;
        for (int i = 0; i < arr.length; i++) {
            sayilarToplami+=arr[i];

        }

        double ortalama=sayilarToplami/sayiAdedi;

        System.out.println("girmis oldugunuz dizideki sayilarin toplami : "+sayilarToplami);
        System.out.println("girmis oldugunuz sayilarin ortalamasi : "+ortalama);

    }


}
