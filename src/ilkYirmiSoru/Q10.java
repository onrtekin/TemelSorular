package ilkYirmiSoru;

public class Q10 {
    public static void main(String[] args) {

        // 1000 e kadar fibonacci dizilimi


        int a=1;
        int b=1;
        int c;

        System.out.print(a+" ");
        System.out.print(b+" ");
        do{
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }while(a+b<=1000);

    }
}
