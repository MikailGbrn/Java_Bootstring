public class CaraKerjaArray {
    public static void main(String[] args) {
        String genre[];
        genre = new String[5];

        genre[0] = "Horror";
        genre[1] = "Comedy";
        genre[2] = "Romance";
        genre[3] = "Mistery";
        genre[4] = "Thriller";

        // mengambil data tanpa looping
        System.out.println(genre[3]);

        // mengambil data dengan looping
        System.out.println("Genre film yang layak ditonton antaralain: ");
        for (int i = 0; i < genre.length; i++) {
            System.out.println("- " + genre[i]);
        }
    }
}
