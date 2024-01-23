package Exception;
//Cindy Alya Putri 22533644 TI 3D
public class NullPointerExceptionCindy {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = getStringLength(str);
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Objek null tidak dapat digunakan.");
            // Penanganan error lainnya sesuai kebutuhan
        }
    }

    private static int getStringLength(String str) {
        return str.length();
    }
}

