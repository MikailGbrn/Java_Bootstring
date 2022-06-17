import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {
        // deklarasi
        Scanner in = new Scanner(System.in);
        int[] bilangan = new int[3];

        // input data
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukkan Bilangan Ke-" + (i + 1) + ": ");
            bilangan[i] = in.nextInt();
        }

        // proses
        // mencari rata-rata
        int jumlah = 0;
        for (int i = 0; i < bilangan.length; i++) {
            jumlah = jumlah + bilangan[i];
        }
        double rata2 = jumlah / bilangan.length;
        System.out.println("Rata-ratanya adalah: " + rata2);

        // mencari bilangan terbesar
        int terbesar = 0;
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] > terbesar) {
                terbesar = bilangan[i];
            }
        }
        System.out.println("Bilangan terbesarnya adalah: " + terbesar);

        // mencari bilangan terkecil
        int terkecil = 0;
        for (int i = 0; i < bilangan.length; i++) {
            if (terkecil == 0) {
                terkecil = bilangan[i];
            }else if (bilangan[i] < terkecil){
                terkecil = bilangan[i];
            }
        }
        System.out.println("Bilangan terkecilnya adalah: " + terkecil);
    }
}
