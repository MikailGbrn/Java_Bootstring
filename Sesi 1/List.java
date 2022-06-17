import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> mobil = new ArrayList<>();
        mobil.add("bmw");
        mobil.add("mercedes");
        mobil.add("pajero");
        System.out.println(mobil);
        mobil.add("truk");
        System.out.println(mobil);
        System.out.println(mobil.get(3));
    }
}
