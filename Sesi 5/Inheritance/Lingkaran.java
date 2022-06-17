public class Lingkaran extends BangunDatar {
    float r;

    @Override
    public float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("ini luas lingkaran : " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("ini keliling lingkaran : " + keliling);
        return keliling;
    }
}
