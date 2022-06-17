class Persegi extends BangunDatar {
    float sisi;

    @Override
    public float luas() {
        float luas = this.sisi * this.sisi;
        System.out.println("ini luas persegi: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        float keliling = 4 * this.sisi;
        System.out.println("ini keliling persegi: " + keliling);
        return keliling;
    }
}
