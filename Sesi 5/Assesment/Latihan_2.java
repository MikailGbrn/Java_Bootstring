public class Latihan_2 {
    public static void main(String[] args) {
        String[][] kelas = {
            {"php", "ruby", "java"}, {"golang", "javascript", "swift"}
        };

        for (int i = 0; i < kelas.length; i++) {
            for (int j = 0; j <= kelas.length; j++) {
                System.out.println("siapa yang akan duduk di kelas (" + i + ", " + j + "): " + kelas[i][j] );
            }
        }

        System.out.println("=========================================");
        for (int i = 0; i < kelas.length; i++) {
            for (int j = 0; j <= kelas.length; j++) {
                System.out.print("|" + kelas[i][j] + "|            ");
            }
            System.out.println();
        }
        System.out.println("=========================================");
    }
}
