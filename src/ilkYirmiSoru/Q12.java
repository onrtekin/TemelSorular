package ilkYirmiSoru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            System.out.print("lutfen "+i+". sayiyi giriniz ");
            sayilar.add(scan.nextInt());
        }
        System.out.println(sayilar);

        List<Integer> tekSayilar=new ArrayList<Integer>();
        List<Integer> ciftSayilar=new ArrayList<Integer>();
        int sayacCift=0;
        int sayacTek=0;
        for (int i = 0; i < sayilar.size(); i++) {
            if(sayilar.get(i)%2==0){
                ciftSayilar.add(sayilar.get(i));
                sayacCift++;
            }else if(sayilar.get(i)%2!=0){
                tekSayilar.add(sayilar.get(i));
                sayacTek++;
            }

        }
        System.out.println(ciftSayilar);
        System.out.println(tekSayilar);


int ciftSayilarToplami=0;
        for (int i = 0; i <ciftSayilar.size() ; i++) {
            ciftSayilarToplami+=ciftSayilar.get(i);
        }
        int ciftSayilarOrtalamasi=ciftSayilarToplami/sayacCift;

        int tekSayilarToplami=0;
        for (int i = 0; i <tekSayilar.size() ; i++) {
            tekSayilarToplami+=tekSayilar.get(i);
        }
        int tekSayilarOrtalamasi=tekSayilarToplami/sayacTek;

        System.out.println("girmis oldugunuz sayilar icerisinde "+sayacCift+" adet cift sayi "+sayacTek+" adet tek sayi" +
                " cift sayilarin toplami : "+ciftSayilarToplami+" cift sayilarin ortalamasi : "+ciftSayilarOrtalamasi
        +" tek sayilar toplami : "+tekSayilarToplami+" tek sayilarin ortalamasi : "+tekSayilarOrtalamasi+" dir..");

    }
}
