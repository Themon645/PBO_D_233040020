package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("220001", "Budi");
        Mahasiswa m2 = new Mahasiswa("220002", "Siti");
        Mahasiswa m3 = new Mahasiswa("220003", "Andi");

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();
        System.out.println();
        m3.displayInfo();
        System.out.println();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
