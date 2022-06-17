import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int c, first, last, middle, n, search, array[];
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Masukkan " + n + " angka: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("Masukkan Angka yang Ingin Dicari: ");
        System.out.println();
        search = in.nextInt();
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
                middle = (first + last) / 2;
            } else if (array[middle] == search) {
                System.out.println(search + " Adalah angka yang kamu cari, ada di " + (middle + 1));
                break;
            } else {
                last = middle - 1;
                middle = (first + last) / 2;
                if (middle < 1) {
                    middle = 1;
                }
            }
        }
        if (first > last) {
            System.out.println("tidak ada dalam daftar");
        }
    }
}
