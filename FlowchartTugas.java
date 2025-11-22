import java.util.Scanner;

public class FlowchartTugas {

    public static void main(String[] args) {

        Scanner angray = new Scanner(System.in);

        int[][] hasil = new int[10][6];
        int pilihan;

        do {
            System.out.println("\n=== PROGRAM ===");
            System.out.println("1. Isi array 10x6");
            System.out.println("2. Hitung total dan rata2 baris");
            System.out.println("3. Hitung total dan rata2 kolom)");
            System.out.println("4. Hitung total dan rata2 semua");
            System.out.println("5. keluarrrrzz");
            System.out.print("Pilih menu: ");
            pilihan = angray.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\n--- Proses 1: Isi array 10x6 ---");

                    int baris = 0;
                    while (baris < hasil.length) {
                        int kolom = 0;
                        while (kolom < hasil[0].length) {
                            hasil[baris][kolom] = baris + kolom;
                            kolom++;
                        }
                        baris++;
                    }

                    System.out.println("Array berhasil diisi.\n");
                    break;

                case 2:
                    System.out.println("\n--- Proses 2: total dan rata2 baris ---");

                    baris = 0;
                    while (baris < hasil.length) {

                        double total = 0;

                        int kolom2 = 0;
                        while (kolom2 < hasil[0].length) {
                            total = total + hasil[baris][kolom2];
                            kolom2++;
                        }

                        double rata = total / 6;
                        System.out.println("Baris " + baris + " -> Rata-rata: " + rata);

                        baris++;
                    }

                    break;

                case 3:
                    System.out.println("\n--- Proses 3: total dan rata2 kolom ---");

                    int kolom = 0;
                    while (kolom < hasil[0].length) {

                        int total = 0;
                        baris = 0;

                        while (baris < hasil.length) {
                            total = total + hasil[baris][kolom];
                            baris++;
                        }

                        double rata = total / 10.0;
                        System.out.println("Kolom " + kolom + " -> Rata-rata: " + rata);

                        kolom++;
                    }

                    break;

                case 4:
                    System.out.println("\n--- Proses 4: Rata2 semua array ---");

                    int total = 0;
                    baris = 0;

                    while (baris < hasil.length) {
                        int kolom4 = 0;
                        while (kolom4 < hasil[0].length) {
                            total += hasil[baris][kolom4];
                            kolom4++;
                        }
                        baris++;
                    }

                    double rataTotal = total / 60.0;
                    System.out.println("Rata-rata seluruh data = " + rataTotal);

                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak ada!");
            }

        } while (pilihan != 5);

    }
}
