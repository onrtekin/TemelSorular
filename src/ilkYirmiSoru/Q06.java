package ilkYirmiSoru;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        int tekSayilarToplami=0;

        for (int i = 1; i <=sayi ; i++) {
            if(i%2!=0){
               tekSayilarToplami+=i;
            }
        }
        System.out.println(tekSayilarToplami);

    }
}
