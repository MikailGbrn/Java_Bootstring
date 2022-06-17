import java.util.TreeMap;

public class Node {
    Node left, right;
    int value;

    public void input(int a) {
        value = a;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node();
        int menu = 1;
        int r = 1;
        int a;
        while (menu != 3) {
            System.out.print("1. input\n2. View\n3. exit\n : ");
            menu = tree.in.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan Angka : ");
                a = tree.in.nextInt();
                if (r == 1) {
                    root.input(a);
                    r--;
                } else {
                    tree.insert(root, a);
                }
            } else if (menu == 2) {
                tree.view(root);
            } else if (menu == 3) {
                System.out.println("sampai jumpa, selamat datang kembali");
            } else {
                System.out.println("salah");
            }
            System.out.println();
        }
    }
}
