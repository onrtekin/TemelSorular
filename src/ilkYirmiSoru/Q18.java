package ilkYirmiSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
       String str=scan.nextLine();

       int sayac=0;
       int harfsayisi=str.length();

        for (int i = 0; i < str.length(); i++) {

            if(str.substring(i,i+1).equals(" ")){
                sayac++;
            }

        }
        System.out.println("kelime sayisi : "+(sayac+1));
        harfsayisi-=sayac;
        System.out.println("harf sayisi : "+harfsayisi);





    }

}
