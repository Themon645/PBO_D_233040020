package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_3;

// Kelas untuk menghitung jumlah instance yang dibuat
public class Counter {
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
