package pertemuan_7.PBO_D_233040020;
import java.util.*;

public class KartuHasilStudi {
  private String semester;
  private double ips;
  private List<Matakuliah> daftarMatakuliah;

  public KartuHasilStudi(String semester) {
    this.semester = semester;
    this.daftarMatakuliah = new ArrayList<>();
  }

  public void addMatakuliah(Matakuliah matakuliah) {
    daftarMatakuliah.add(matakuliah);
  }

  public String display() {
    StringBuilder sb = new StringBuilder();
    for (Matakuliah mk : daftarMatakuliah) {
      sb.append(mk.display());
      sb.append("\n");
    }
    return sb.toString();
  }

  public void hitungIPS() {
    double totalNilai = 0;
    int totalSKS = 0;
    for (Matakuliah mk : daftarMatakuliah) {
      totalNilai += mk.nilaiIndex() * mk.getSKS();
      totalSKS += mk.getSKS();
    }
    if (totalSKS > 0) {
      ips = totalNilai / totalSKS;
    } else {
      ips = 0;
    }
  }

  public void setKHS(String semester, double ips, List<Matakuliah> daftarMatakuliah) {
    this.semester = semester;
    this.ips = ips;
    this.daftarMatakuliah = daftarMatakuliah;
  }

  public String getSemester() {
    return semester;
  }

  public double getIps() {
    return ips;
  }

  public List<Matakuliah> getDaftarMatakuliah() {
    return daftarMatakuliah;
  }
  
}
