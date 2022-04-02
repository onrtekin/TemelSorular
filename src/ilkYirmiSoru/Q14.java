package ilkYirmiSoru;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Olusturmak istediginiz dizinin eleman sayisini giriniz : ");
        int elemanSayisi=scan.nextInt();

        int arr[]=new int[elemanSayisi];

        Random rnd=new Random();
int toplam=0;
double ortalama=0;
        for (int i = 0; i < elemanSayisi; i++) {
             arr[i]=rnd.nextInt(100);
             toplam+=arr[i];

        }
          double farkToplam=0;
        ortalama=toplam/elemanSayisi;
        System.out.println(Arrays.toString(arr));
        System.out.println("dizideki elemanlarin toplami : "+toplam+" elemanlarin ortalamasi : "+ortalama);
        for (int i = 0; i < arr.length; i++) {
            farkToplam+=(arr[i]-ortalama)*(arr[i]-ortalama);
        }

       double sapma;
        sapma=Math.sqrt(farkToplam/(elemanSayisi-1));
        System.out.println("standart sapma : "+sapma);
    }
}
