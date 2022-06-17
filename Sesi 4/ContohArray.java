public class ContohArray {
    public static void main(String[] args) {
        int[] contoh;
        contoh = new int[4];
        System.out.println(contoh.length);

        // memasukkan data
        contoh[0] = 5;
        contoh[1] = 2;
        contoh[2] = contoh[1] + 10;
        contoh[3] = 11;

        System.out.println(contoh[2]);
    }
}
