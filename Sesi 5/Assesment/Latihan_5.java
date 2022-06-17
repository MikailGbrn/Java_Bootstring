import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Latihan_5 {

    public static void main(String[] args) {

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        int[] kode = new int[5];
        int[] qty = new int[5];
        int[] harga = new int[5];
        double[] sub_total = new double[5];
        double[] diskon = new double[5];
        String[] barang = new String[5];
        double total_bayar = 0;

        int i;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Beli: ");
        i = in.nextInt();

        for (int j = 0; j < i; j++) {
            System.out.print("Masukkan Kode Barang Ke-" + (j + 1) + ": ");
            kode[j] = in.nextInt();
            System.out.print("Masukkan Jumlah Barang: ");
            qty[j] = in.nextInt();

            switch (kode[j]) {
                case 1:
                    barang[j] = "Mouse Bluetooth 5.0";
                    harga[j] = 149999;
                    diskon[j] = 0.1;
                    break;

                case 2:
                    barang[j] = "Headphone Eksternal";
                    harga[j] = 246000;
                    diskon[j] = 0.05;
                    break;

                case 3:
                    barang[j] = "Power Bank 10.000 mAh";
                    harga[j] = 136000;
                    diskon[j] = 0;
                    break;

                case 4:
                    barang[j] = "Tripod Kamera";
                    harga[j] = 267999;
                    diskon[j] = 0.2;
                    break;

                case 5:
                    barang[j] = "Smart Watch Xiomi";
                    harga[j] = 899000;
                    diskon[j] = 0.1;
                    break;

                default:
                    System.out.println("Kode Barang Tidak Tersedia");
                    break;
            }
        }

        // Pengaturan format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("No   Nama Barang             Harga            QTY  Diskon   Sub Total");

        for (int j = 0; j < i; j++) {
            sub_total[j] = ((qty[j] * harga[j]) - (qty[j] * harga[j] * diskon[j]));
            total_bayar += sub_total[j];
            System.out.println(j + 1 + "    " + barang[j] + "   " + kursIndonesia.format(harga[j]) + "    " + qty[j]
                    + "     " + (int) (diskon[j] * 100) + "%" + "     " + kursIndonesia.format(sub_total[j]));
        }

        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));

    }
}
