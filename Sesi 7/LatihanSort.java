import java.util.Scanner;

public class LatihanSort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data: ");
        int jumlah = in.nextInt();

        // input data
        int[] data = new int[jumlah];
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan Data ke-" + (i + 1) + ": ");
            data[i] = in.nextInt();
        }

        // sorting data

        System.out.println("===========================");
        System.out.println("Data sebelum di sorting:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("===========================");

        System.out.println("Proses Sorting");
        System.out.println();

        int temp = 0;

        for (int i = 0; i < data.length - 1; i++) {
            System.out.println("Iterasi " + (i + 1) + ": ");
            int node = data[i];
            boolean tukar = false;
            int index = 0;
            String pesan = " ---> Tidak Ada Penukaran";

            for (int j = i + 1; j < data.length; j++) {
                if (node > data[j]) {
                    tukar = true;
                    index = j;
                    node = data[j];
                }
            }

            if (tukar == true) {
                pesan = " ---> Data " + data[i] + " Ditukar dengan Data " + data[index];
                temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }

            for (int j = 0; j < data.length; j++) {
                System.out.print(data[j] + " ");
            }

            System.out.println(pesan + "\n");

        }

        System.out.println("=================");
        System.out.println("Data Setelah di Sorting: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

    }
}
