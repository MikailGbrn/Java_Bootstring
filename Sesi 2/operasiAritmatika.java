import java.util.Scanner;

public class operasiAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("--SISA BAGI--");
        System.out.print("input angka pertama: ");
        angka1 = keyboard.nextInt();

        System.out.print("input angka kedua: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 % angka2;
        System.out.println("hasil dari Hasil Bagi = " + hasil);

        System.out.println("--PENJUMLAHAN--");
        System.out.print("input angka pertama: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka kedua: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 + angka2;
        System.out.println("hasil penjumlahan = " + hasil);

        System.out.println("--PENGURANGAN--");
        System.out.print("input angka pertama: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka kedua: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 - angka2;
        System.out.println("hasil pengurangan =" + hasil);

    }
}
