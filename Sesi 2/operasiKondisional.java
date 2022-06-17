public class operasiKondisional {
    public static void main(String[] args) {
        int nilaiA = 5;
        int nilaiB = 15;
        int hasil = 0;

        hasil = nilaiA & nilaiB;
        System.out.println("a & b = " + hasil);

        hasil = nilaiA | nilaiB;
        System.out.println("a | b = " + hasil);

        hasil = nilaiA << nilaiB;
        System.out.println("a << b = " + hasil);

        hasil = nilaiA >> nilaiB;
        System.out.println("a >> b = " + hasil);

        hasil = 15 >>> 2;
        System.out.println("a >>> b = " + hasil);

        hasil = ~nilaiA;
        System.out.println("~a = " + hasil);
    }
}