public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i>=3){
                System.out.println(i);
                break;
            }
            System.out.println("Loading...");
        }
    }
}
