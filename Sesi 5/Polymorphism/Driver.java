public class Driver {
    public static void main(String[] args) {
        AnakUmur1Tahun anak = new AnakUmur1Tahun();
        anak.makan();

        Induk ibu = new AnakUmur1Tahun();
        ibu.minum();

        InterfaceAnak ayah = new AnakUmur1Tahun();
        ayah.menyapa();
    }
}
