public class PersegiPanjang extends BangunDatar {
    float panjang;
    float tinggi;

    @Override
    public float luas() {
        float luas = this.panjang * this.tinggi;
        System.out.println("ini adalah luas persegi panjang : " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = 2 * (this.panjang * this.tinggi);
        System.out.println("ini adalah keliling persegi panjang : " + keliling);
        return keliling;
    }
}
