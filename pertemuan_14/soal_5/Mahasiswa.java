package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_5;

// Kelas Mahasiswa dengan NIM final, static totalMahasiswa, dan konstanta MAX_SKS
public class Mahasiswa {
    private final String nim; // Tidak bisa diubah setelah diinisialisasi
    private String nama;
    private static int totalMahasiswa = 0;
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Max SKS: " + MAX_SKS);
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
