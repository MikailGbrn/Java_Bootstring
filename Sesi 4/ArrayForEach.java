import java.util.Scanner;

public class ArrayForEach {
    public static void main(String[] args) {
        String[] profesi = new String[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < profesi.length; i++) {
            System.out.print("Masukkan Jenis Profesi : ");
            profesi[i] = scan.nextLine();
        }

        System.out.println("--------------------------------------------");

        for (String a : profesi) {
            System.out.println(a);
        }
    }
}
