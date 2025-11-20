Jawaban Pertanyaan Percobaan 1
1. Apakah pengisian elemen array harus berurutan dari indeks ke-0?

Tidak harus.
Java mengizinkan kamu mengisi elemen mana saja selama baris dan kolomnya valid.
Namun pengisian berurutan lebih rapi dan mencegah error.

2. Mengapa terdapat null pada daftar nama penonton?

Karena elemen array tidak diberi nilai.
Default untuk array tipe String = null.

3. Lengkapi daftar penonton…

→ Ini tugas pengisian, sehingga tidak perlu dijawab berupa teks. Kamu cukup menulis isi array sesuai tabel yang diberikan.

4. Jelaskan fungsi dari penonton.length dan penonton[0].length

penonton.length
→ jumlah baris pada array 2D.

penonton[0].length
→ jumlah kolom pada baris ke-0.

Apakah semua baris punya nilai length sama?
Ya, untuk array 2D biasa yang dibuat seperti new String[4][2].
Semua baris otomatis memiliki panjang kolom yang sama, yaitu 2.

5. Modifikasi kode menggunakan for untuk menampilkan panjang setiap baris

→ Tidak perlu dijelaskan karena kamu hanya diminta memodifikasi kode.

6. Modifikasi menggunakan foreach

→ Sama, hanya implementasi.

7 & 8. Menampilkan nama penonton baris ke-3

→ Implementasi kode.

9. Menampilkan nama penonton untuk setiap baris

→ Implementasi kode.

10. Kelebihan & Kekurangan foreach

Kelebihan foreach:

Syntax lebih sederhana.

Tidak perlu indeks.

Mengurangi risiko index out of bounds.

Kekurangan foreach:

Tidak bisa mengakses indeks secara langsung.

Tidak bisa memodifikasi elemen tertentu berdasarkan posisi.

Tidak cocok untuk loop yang butuh kontrol indeks (misal melompati elemen tertentu).

11. Berapa indeks baris maksimal array penonton?

Jika array berukuran 4 baris, indeksnya:
0, 1, 2, 3 → jadi indeks terbesar = 3.

12. Berapa indeks kolom maksimal array penonton?

Jika kolomnya 2, indeks:
0, 1 → jadi indeks terbesar = 1.

13. Apa fungsi dari String.join()?

Untuk menggabungkan beberapa String menjadi satu dengan pemisah tertentu.
Contoh:

String.join(", ", "A", "B", "C");
// Output: "A, B, C"

✅ Jawaban Pertanyaan Percobaan 2
1. Apakah pengisian elemen array dari Scanner harus dimulai dari indeks 0?

Tidak harus, tetapi disarankan.
Scanner hanya membaca input, tidak memaksa mulai dari indeks 0.

2. Modifikasi program untuk opsi menu

→ Implementasi kode, tidak perlu jawaban teori.

3. Meng-handle nomor baris/kolom yang tidak tersedia

→ Harus pakai pengecekan:

if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2)

4. Warning jika kursi sudah terisi

→ Tambahkan pengecekan:

if (penonton[baris][kolom] != null)

5. Pada menu 2 ganti null dengan “*”**

→ Tugas implementasi kode.

✅ Jawaban Pertanyaan Percobaan 3
2. Apa fungsi dari Arrays.toString()?

Untuk mengubah array 1 dimensi menjadi string sehingga bisa dicetak dengan mudah.

3. Nilai default array tipe int?

0

5. Apakah panjang array dapat dimodifikasi setelah dibuat?

Tidak bisa.
Panjang array di Java fixed setelah instansiasi.

✅ Jawaban Percobaan 4
1. Bagaimana jika jumlah siswa & mata kuliah berubah?

Harus mengubah array menjadi dinamis, contoh:

int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];


Jumlah baris & kolom ditentukan oleh input user (Scanner).