import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args) {
        float total;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah total belanja Anda: ");
        total = in.nextFloat();

        if (total >= 1000000) {
            total = total - (total * 10/100);
            System.out.println("Diskon : 10%");
        }else {
            System.out.println("Diskon : 0");
        }

        System.out.println("Total bayar : " + total);
    }
}
