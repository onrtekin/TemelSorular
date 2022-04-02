package ilkYirmiSoru;

public class Q11 {
    // 0-1000 Asal sayilar
    public static void main(String[] args) {
        int sayac=0;

        for (int i = 2; i <=1000; i++) {
            sayac=0;
            for (int j = 2; j <=i ; j++) {
                if(i%j==0){
                    sayac++;
                }
            }if(sayac==1){
                System.out.print(i+" ");

            }
        }

    }

}
