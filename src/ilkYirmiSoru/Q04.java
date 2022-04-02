package ilkYirmiSoru;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfrn vize notunuzu giriniz: ");
        double vize =scan.nextDouble();
        System.out.println("Lutfrn final notunuzu giriniz: ");
        double finall =scan.nextDouble();
        double ortalama=(vize*0.4)+(finall*0.6);

        if(ortalama>=60){
            System.out.println("Ortalama notunuz : "+ortalama+" GECTİNİZ");

        }else{
            System.out.println("Ortalama notunuz : "+ortalama+" KALDINIZ");
        }

    }
}
