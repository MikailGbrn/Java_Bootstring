public class Latihan_2 {
    public static void main(String[] args) {
        int counter = 0;
        boolean ulang = true;

        while (ulang) {
            if (counter <= 10) {
                System.out.println("Perulangan ke-" + counter);
                counter++;
            }else {
                ulang = false;
            }
            
        }
    }
}
