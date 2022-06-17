abstract class Manusia {
    protected abstract void nyanyiLagu();
}

class Cowok extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("na na na na");
    }
}

class Cewek extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("la la la la");
    }
}

public class Cetak {
    static double maxNumber(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int maxNumber(int a) {
        return a;
    }

    public static void main(String[] args) {

        // overriding
        Manusia cowok = new Cowok();
        cowok.nyanyiLagu();

        Manusia cewek = new Cewek();
        cewek.nyanyiLagu();

        System.out.println("==================");

        // overloading
        System.out.println(maxNumber(10, 30));
        System.out.println(maxNumber(100));
    }
}
