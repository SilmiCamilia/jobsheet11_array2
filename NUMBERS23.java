import java.util.Arrays;

public class NUMBERS23 {
    public static void main(String[] args) {

        int[][] angka = new int[3][];
        angka[0] = new int[5];   
        angka[1] = new int[3];  
        angka[2] = new int[1];  

        System.out.println("Isi baris 0: " + Arrays.toString(angka[0]));

        System.out.println("Semua baris:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Baris " + i + ": " + Arrays.toString(angka[i]));
        }

        System.out.println("Semua elemen:");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }
}
