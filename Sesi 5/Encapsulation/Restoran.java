public class Restoran {
    private String menu;
    private double harga;
    private boolean spesial;

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    public String getMenu() {
        return this.menu;
    }

    public double getHarga() {
        return this.harga;
    }

    public boolean getSpesial() {
        return this.spesial;
    }

}
