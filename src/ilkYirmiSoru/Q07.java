package ilkYirmiSoru;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ilk sayiyiyi giriniz: ");
        int ilkSayi=scan.nextInt();
        System.out.println("son sayiyi giriniz : ");
        int sonSayi=scan.nextInt();


        for (int i =ilkSayi; i <=sonSayi ; i++) {
            if(i%7==0){

                System.out.print(i+" ");
            }
        }
    }

}
