public class Makanan {
    public static void main(String[] args) {
        Restoran data = new Restoran();

        data.setMenu("Mie Aceh");
        data.setHarga(17000);
        data.setSpesial(true);

        System.out.println("Menu Makanan : " + data.getMenu());
        System.out.println("Harga Makanan : " + data.getHarga());
        if (data.getSpesial()) {
            System.out.println("Kamu Mendapatkan Harga Spesial!");
        } else {
            System.out.println("Harga Normal :p");
        }
    }
}
