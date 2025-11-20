import java.util.Scanner;

public class siakad23 {
    
public static void main(String[] args) {

        Scanner cami = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa = ");
        int jumlahSiswa = cami.nextInt();

        System.out.print("Masukkan jumlah mata kuliah = ");
        int matkul = cami.nextInt();

        int[][] nilai = new int[jumlahSiswa][matkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Input nilai untuk siswa ke-" + i);
            for (int j = 0; j < matkul; j++) {
                System.out.print("Nilai MK ke-" + j + "= ");
                nilai[i][j] = cami.nextInt();
            }
        }

        System.out.print("\nRata-rata setiap siswa =");
        for (int i = 0; i < jumlahSiswa; i++) {
            int total = 0;
            for (int j = 0; j < matkul; j++) {
                total = total + nilai[i][j];
            }
            double rataSiswa = total / (double) matkul;
            System.out.print("Siswa " + i + ": " + rataSiswa);
        }

        System.out.print("\nRata-rata setiap mata kuliah =");
        for (int j = 0; j < matkul; j++) {
            int totalMK = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalMK = totalMK + nilai[i][j];
            }
            double rataMK = totalMK / (double) jumlahSiswa;
            System.out.println("MK " + j + ": " + rataMK);
        }
    }
}
