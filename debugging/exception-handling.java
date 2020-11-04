public class Debug {

    public static void main(String[] args) {

        try {
            int width = 0;
            int length = 40;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
        }

        int ratio = length / width;

    }

}