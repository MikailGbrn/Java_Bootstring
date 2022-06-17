import java.util.Scanner;

public class hitungGrade {
    public static void main(String[] args) {
        int nilai;
        String grade = null;

        Scanner input = new Scanner(System.in);

        System.out.print("inputkan nilai kamu: ");
        nilai = input.nextInt();

        if(nilai >= 90){
            grade = "A";
        }else if(nilai >= 80){
            grade = "B";
        }else if(nilai >= 70){
            grade = "C";
        }else if(nilai >= 60){
            grade = "D";
        }

        System.out.println("Kamu mendapatkan grade " + grade);

    }
}
