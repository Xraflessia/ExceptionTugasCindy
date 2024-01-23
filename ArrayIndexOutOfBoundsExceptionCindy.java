package exception;
public class ArrayIndexOutOfBoundsExceptionCindy {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int value = accessArrayElement(numbers, 5);
            System.out.println("Nilai array: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks array di luar batas.");
            // Penanganan error lainnya sesuai kebutuhan
        }
    }

    private static int accessArrayElement(int[] array, int index) {
        return array[index];
    }
}
