import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Latihan_4 {

    public static void main(String[] args) {
        int tahun;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        tahun = in.nextInt();

        if(tahun % 4 == 0){
            System.out.println(tahun + " merupakan tahun kabisat!");
        }else {
            System.out.println(tahun + " bukan merupakan tahun kabisat!");
        }
    }
}
