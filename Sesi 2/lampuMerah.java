import java.util.Scanner;

public class lampuMerah {
    public static void main(String[] args) {
        String warna;

        Scanner in = new Scanner(System.in);
        System.out.print("Warna Lampu Sekarang Adalah: ");
        warna = in.nextLine();

        switch(warna){
            case "merah":
                System.out.println("Berhenti");
                break;
            case "kuning":
                System.out.println("siap-siap");
                
            case "hijau":
                System.out.println("Jalannn!!");
                break;
            default:
                System.out.println("salah!");
        }
    }
}
