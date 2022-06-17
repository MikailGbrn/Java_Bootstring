import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> Laptop = new LinkedList<>();
        Laptop.add("lenovo");
        Laptop.add("msi");
        Laptop.add("ROG");
        Laptop.add("Macbook");

        System.out.println("Laptop pertama: " + Laptop.getFirst()); //lenovo
        System.out.println("Laptop index ke 2: " + Laptop.get(2));

        Laptop.addFirst("HP");

        System.out.println("Laptop pertama setelah ditambahkan: " + Laptop.getFirst());

        System.out.println("List Laptop: " + Laptop);

        if(Laptop.contains("Macbook")){
            System.out.println("mahal");
        }else{
            System.out.println("murah");
        }
    }
}
