import java.util.Scanner;

public class programSederhana {
    public static void main(String[] args) {
        int jawaban;

        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Pagi");
        System.out.println("Selamat datang..");

        System.out.print("Apakah anda mau sarapan? (1 untuk mau) ");
        jawaban = input.nextInt();

        if (jawaban == 1) {
            System.out.println("nom, nom, nom, kenyang!");
        } else {
            System.out.println("nanti saja!");
        }

    }
}
