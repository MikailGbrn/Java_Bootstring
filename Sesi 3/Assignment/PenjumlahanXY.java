public class PenjumlahanXY {
    public static void main(String[] args) {
        int x1 = 8;
        int x2 = 0;
        int y1 = 5;
        int y2 = 10;
        // operasi perkalian
        x1 = (y1 + y2) * (y1 + y2);
        x2 = (y1 % 4) * y2;
        // hasil evaluasi
        System.out.println("X1 >= X2 : " + (x1 >= x2));
        System.out.println("X2 >= X1 : " + (x2 >= x1));
        System.out.println("X1 mod 4 == ++X2 mod 5 : " + ((x1 % 4) == (++x2 % 5)));

    }
}
