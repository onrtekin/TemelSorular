package ilkYirmiSoru;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz: ");

        String isim=scan.nextLine();




        for (int i = isim.length()-1; i >=0; i--) {
            System.out.print(isim.charAt(i));
        }

    }
}
