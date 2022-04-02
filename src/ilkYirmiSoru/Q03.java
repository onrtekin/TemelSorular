package ilkYirmiSoru;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz: ");
        int sayi2=scan.nextInt();
        System.out.println("Lutfen 3. sayiyi giriniz: ");
        int sayi3=scan.nextInt();

        if(sayi1>sayi2&&sayi1>sayi3){
            System.out.println("girmiz oldugunuz sayilardan en buyugu  : "+sayi1);

        }else if(sayi2>sayi1&&sayi2>sayi3){
            System.out.println("girmiz oldugunuz sayilardan en buyugu  : "+sayi2);
        }else{
            System.out.println("girmiz oldugunuz sayilardan en buyugu  : "+sayi3);
        }


    }
}
