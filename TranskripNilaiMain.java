package pertemuan_7.PBO_D_233040020;

public class TranskripNilaiMain {
  public static void main(String[] args) {
    // create objek matakuliah
    Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, "Dr. Andi",  1);
    Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Dr. Budi", 2);
    Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Dr. Citra", 3);

    // create objek KHS
    KartuHasilStudi KHS = new KartuHasilStudi("20222");
    KHS.addMatakuliah(mk1);
    KHS.addMatakuliah(mk2);
    KHS.addMatakuliah(mk3);

    // create objek mahasiswa
    Mahasiswa mhs = new Mahasiswa("303020001", "Jhon");

    // create objek TranskripNilai
    TranskripNilai transkrip = new TranskripNilai(mhs);
    transkrip.addKHS(KHS);
    transkrip.display();
  }
}
