package ilkYirmiSoru;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi girininiz : ");
        String isim=scan.nextLine().toLowerCase();
        int isimSesli=0;
       isim= isim.replaceAll(" ","");
        System.out.println(isim);

        for (int i = 0; i < isim.length(); i++) {
            if(isim.charAt(i)=='a'||isim.charAt(i)=='e'||isim.charAt(i)=='i'||isim.charAt(i)=='o'||isim.charAt(i)=='u'){
                isimSesli++;
            }

        }

        System.out.println("gidiginiz isimde  "+isimSesli+" tane sesli "+(isim.length()-isimSesli)+" tane sessiz harf bulunmaktadir");

    }
}
