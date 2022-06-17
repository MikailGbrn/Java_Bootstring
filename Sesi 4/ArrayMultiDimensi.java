import java.net.SocketTimeoutException;

import javax.xml.transform.Source;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
        String[][] bola = {
                { "Inggris", "Liverpool" },
                { "Italia", "Juventus" },
                { "Spanyol", "Real Madrid" },
                { "Indonesia", "Persib" }
        };

        System.out.println("Klub Sepak Bola Terbaik di Dunia:");
        System.out.println();
        for (int i = 0; i < bola.length; i++) {
            System.out.print("Perwakilan Negara " + bola[i][0] + " : ");
            System.out.println(bola[i][1]);
            System.out.println("---------------------------------------");
        }
    }
}
