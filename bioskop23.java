public class bioskop23 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gilang";
        penonton[3][1] = "Hana";

        System.out.println("Daftar Penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print(penonton[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Jumlah baris = " + penonton.length);
        System.out.println("Panjang kolom baris 0 = " + penonton[0].length);

        System.out.println("\nPanjang setiap baris:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Baris " + i + " = " + penonton[i].length);
        }

        System.out.println("\nPanjang setiap baris :");
        int index = 0;
        for (String[] baris : penonton) {
            System.out.println("Baris " + index + " = " + baris.length);
            index++;
        }

        System.out.println("\nPenonton baris ke-3:");
        for (int j = 0; j < penonton[2].length; j++) {
            System.out.println(penonton[2][j]);
        }

        System.out.println("\nPenonton baris ke-3:");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }
        System.out.println("\nDaftar Penonton lengkap:");
        for (String[] baris : penonton) {
            for (String nama : baris) {
                System.out.print(nama + " ");
            }
            System.out.println();
        }
    }
}
