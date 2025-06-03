package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_4;

// Kelas dengan static block untuk inisialisasi awal
public class DatabaseConnection {
    public static String connectionString;

    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Inisialisasi koneksi database telah dilakukan.");
    }
}
