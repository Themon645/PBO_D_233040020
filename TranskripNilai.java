package pertemuan_7.PBO_D_233040020;
import java.util.*;

public class TranskripNilai {
  private Date tglCetak;
  private double ipk=0.0;
  private List<KartuHasilStudi> KartuHasilStudi;
  private Mahasiswa mahasiswa;
  
  public TranskripNilai(Mahasiswa mahasiswa) {
    super();
    this.mahasiswa = mahasiswa;

    KartuHasilStudi = new ArrayList<KartuHasilStudi>();
    tglCetak = new Date();
  }

  public void hitungIPK() {
    double totalIPS=0;
    int totalSemester=0;

    for (KartuHasilStudi khs : KartuHasilStudi) {
      khs.hitungIPS();
      totalIPS += khs.getIps();
      totalSemester+=1;
    }

    if (totalSemester > 0) {
      ipk = totalIPS / totalSemester;
    }
  }
  public void addKHS(KartuHasilStudi khs) {
    KartuHasilStudi.add(khs);
  }
  public void display() {
    hitungIPK();
    System.out.println(mahasiswa.display());
    System.out.println("Tanggal Cetak: " + tglCetak);
    System.out.println("IPK: " + ipk);
    for (KartuHasilStudi khs : KartuHasilStudi) {
      System.out.println(khs.display());
    }
  }

  public void setTranskripNilai(Mahasiswa mahasiswa, Date tglCetak, double ipk, List<KartuHasilStudi> KartuHasilStudi) {
    this.mahasiswa = mahasiswa;
    this.tglCetak = tglCetak;
    this.ipk = ipk;
    this.KartuHasilStudi = KartuHasilStudi;
  }

  public Date getTglCetak() {
    return tglCetak;
  }

  public double getIpk() {
    return ipk;
  }

  public List<KartuHasilStudi> getKHS() {
    return KartuHasilStudi;
  }
  
}
