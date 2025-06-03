package pertemuan_7.PBO_D_233040020.pertemuan_14.soal_3;

public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Jumlah objek Counter: " + Counter.getInstanceCount());
    }
}
