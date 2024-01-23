package Exception;
//Cindy Alya Putri 22533644 TI 3D
public class ArithmeticExceptionCindy {

    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
            // Penanganan error pembagian menggunakan nol
        }
    }
    private static int divideByZero() {
        return 70 / 0;
    }
}
