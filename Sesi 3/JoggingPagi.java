import java.util.Scanner;

public class JoggingPagi {
    public static void main(String[] args) {
        boolean Lari = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while ( Lari ){
            System.out.println("Jogging in Progress");

            System.out.print("Sudah Capek? ");
            jawab = scan.nextLine();

            if (jawab.equalsIgnoreCase("sudah") || jawab.equalsIgnoreCase("udah")){
                Lari = false;
            }
            counter++;
        }
        System.out.println("Pagi ini kamu sudah jogging sebanyak " + counter + " putaran!");
    }
}
