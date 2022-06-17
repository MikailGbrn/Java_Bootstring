import java.util.Scanner;

public class belanja {
    public static void main(String[] args) {
        String jawab;
        int belanja;
        int diskon = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukan total belanjaan anda: ");
        belanja = in.nextInt();
        
        System.out.print("Apakah anda memiliki kartu member? (ya/tidak) ");
        jawab = in.next();
        
        if (jawab.equalsIgnoreCase("ya")){
            if(belanja >= 500000){
                diskon = 100000;
                System.out.println("Selamat! anda mendapatkan diskon sebesar Rp " + diskon);
            }else if (belanja >= 100000){
                diskon = 50000;
                System.out.println("Selamat! anda mendapatkan diskon sebesar Rp " + diskon);
            }else if (belanja < 100000){
                diskon = 0;
            }
        }else if (jawab.equalsIgnoreCase("tidak")){
            if(belanja >= 100000){
                diskon = 25000;
                System.out.println("Selamat! anda mendapatkan diskon sebesar Rp " + diskon);
            }else {
                diskon = 0;
            }
        }

        int bayar = belanja - diskon;
        System.out.println("Total yang harus dibayarkan oleh anda adalah Rp " + bayar);
    }
}
