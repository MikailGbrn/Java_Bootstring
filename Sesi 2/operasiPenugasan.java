import java.net.SocketTimeoutException;
import java.util.function.IntFunction;

public class operasiPenugasan {
    public static void main(String[] args) {
        int a = 50;
        int b = 10;

        for (int i = 0; i < 5; i++) {

            if (a == b) {
                System.out.println("benar");
                break;
            } else {
                System.out.println("salah, B = " + b);
                b++;
            }
        }

        // coba perbandingan

        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a >= b " + (a >= b));
        System.out.println("a <= b " + (a <= b));
    }
}
