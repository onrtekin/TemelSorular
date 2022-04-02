package ilkYirmiSoru;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen 4 basamakli bir sayi giriniz");

        int sayi=scan.nextInt();

      int birler,onlar,yuzler,binler;
      birler=sayi%10;
      sayi=sayi/10;
      onlar=sayi%10;
      sayi=sayi/10;
      yuzler=sayi%10;
      sayi=sayi/10;
      binler=sayi%10;


        System.out.println("Girmis oldugunuz sayi : ");

        switch (binler){
            case 1:
                System.out.print("BİN");
                break;
            case 2:
                System.out.print("İKİBİN");
                break;
            case 3:
                System.out.print("UCBİN");
                break;
            case 4:
                System.out.print("DORTBİN");
                break;
            case 5:
                System.out.print("BESBİN");
                break;
            case 6:
                System.out.print("ALTIBİN");
                break;
            case 7:
                System.out.print("YEDİBİN");
                break;
            case 8:
                System.out.print("SEKİZBİN");
                break;
            case 9:
                System.out.print("DOKUZBİN");
                break;

        }switch (yuzler){
            case 1:
                System.out.print(" YUZ");
                break;
            case 2:
                System.out.print(" İKİYUZ");
                break;
            case 3:
                System.out.print(" UCYUZ");
                break;
            case 4:
                System.out.print(" DORTYUZ");
                break;
            case 5:
                System.out.print(" BESYUZ");
                break;
            case 6:
                System.out.print(" ALTIYUZ");
                break;
            case 7:
                System.out.print(" YEDİYUZ");
                break;
            case 8:
                System.out.print(" SEKİZYUZ");
                break;
            case 9:
                System.out.print(" DOKUZYUZ");
                break;

        }switch (onlar){
            case 1:
                System.out.print(" ON");
                break;
            case 2:
                System.out.print(" YIRMI");
                break;
            case 3:
                System.out.print(" OTUZ");
                break;
            case 4:
                System.out.print(" KIRK");
                break;
            case 5:
                System.out.print(" ELLİ");
                break;
            case 6:
                System.out.print(" ATMIS");
                break;
            case 7:
                System.out.print(" YETMIS");
                break;
            case 8:
                System.out.print(" SEKSEN");
                break;
            case 9:
                System.out.print(" DOKSAN");
                break;

        }switch (birler){
            case 1:
                System.out.print(" BİR");
                break;
            case 2:
                System.out.print(" İKİ");
                break;
            case 3:
                System.out.print(" UC");
                break;
            case 4:
                System.out.print(" DORT");
                break;
            case 5:
                System.out.print(" BES");
                break;
            case 6:
                System.out.print(" ALTI");
                break;
            case 7:
                System.out.print(" YEDİ");
                break;
            case 8:
                System.out.print(" SEKİZ");
                break;
            case 9:
                System.out.print(" DOKUZ");
                break;

        }






    }
}
