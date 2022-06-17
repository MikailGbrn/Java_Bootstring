import java.util.Scanner;

public class Tree {
    static Scanner in = new Scanner(System.in);

    public void insert(Node a, int b) {
        if (b < a.value) {
            if (a.left != null) {
                insert(a.left, b);
            } else {
                a.left = new Node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        } else if (b > a.value) {
            if (a.right != null) {
                insert(a.right, b);
            } else {
                a.right = new Node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    public void view(Node a) {
            System.out.print("Pre Order : ");
            preOrder(a);
            System.out.println(" ");
            System.out.print("In Order : ");
            inOrder(a);
            System.out.println(" ");
            System.out.print("Post Order : ");
            postOrder(a);
            System.out.println(" ");

    }

    public void preOrder(Node a){
        if(a != null){
            System.out.print(a.value+" ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }

    public void inOrder(Node a){
        if(a != null){
            inOrder(a.left);
            System.out.print(a.value+" ");
            inOrder(a.right);
        }
    }

    public void postOrder(Node a){
        if(a != null){
            inOrder(a.left);
            inOrder(a.right);
            System.out.print(a.value+" ");
            
        }
    }
}
