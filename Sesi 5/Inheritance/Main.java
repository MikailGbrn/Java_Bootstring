import javax.swing.border.LineBorder;

public class Main {
    public static void main(String[] args) {

        // menghitung persegi
        Persegi persegi = new Persegi();
        // memasukkan sisi persegi
        persegi.sisi = 10;
        // menghitung luas dan keliling
        persegi.luas();
        persegi.keliling();
        System.out.println("=============");

        // menghitung lingkaran
        Lingkaran bulat = new Lingkaran();
        // memasukkan diameter
        bulat.r = 4;
        // menghitung luas dan keliling lingkaran
        bulat.luas();
        bulat.keliling();
        System.out.println("==========");

        // menghitung persegi panjang
        PersegiPanjang panjanggg = new PersegiPanjang();
        // memasukkan data
        panjanggg.panjang = 10;
        panjanggg.tinggi = 3;
        // menghitung luas dan keliling
        panjanggg.luas();
        panjanggg.keliling();
        System.out.println("==========");

        // menghitung segitiga
        Segitiga segi3 = new Segitiga();
        // memasukkan data segitiga
        segi3.alas = 13;
        segi3.tinggi = 19;
        // menghitung luas
        segi3.luas();
    }
}
