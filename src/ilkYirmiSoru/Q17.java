package ilkYirmiSoru;

public class Q17 {
    //0-1000 ARASİ PALİNDROME SAYİLAR

    public static void main(String[] args) {

        String duz;
        String ters="";

        for (int i = 100; i < 1000; i++) {
            duz=Integer.toString(i);
            ters="";

            for (int j =duz.length()-1; j >=0 ; j--) {
                ters+=duz.charAt(j);

            }if(duz.equals(ters)) System.out.print(i+" ");
        }




    }
}
