package ilkYirmiSoru;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();

        System.out.println("Girmis oldugunuz iki sayinin toplami : "+(sayi1+sayi2));
        System.out.println("Girmis oldugunuz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);


    }
}
