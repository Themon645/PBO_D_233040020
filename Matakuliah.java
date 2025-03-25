package pertemuan_7.PBO_D_233040020;

public class Matakuliah {
  private String kode;
  private String nama;
  private String index;
  private int sks;
  private String dosenPengampu;
  private int semester;

  // Konstruktor
  public Matakuliah(String kode, String nama, String index, int sks, String dosenPengampu, int semester) {
    this.kode = kode;
    this.nama = nama;
    this.index = index;
    this.sks = sks;
    this.dosenPengampu = dosenPengampu;
    this.semester = semester;
  }

  public double nilaiIndex() {
    double nilai = 0;
    switch (index) {
      case "A":
        nilai = 4.0;
        break;
      case "AB":
        nilai = 3.5;
        break;
      case "B":
        nilai = 3.0;
        break;
      case "BC":
        nilai = 2.5;
        break;
      case "C":
        nilai = 2.0;
        break;
      case "D":
        nilai = 1.0;
        break;
      default:
        nilai = 0.0;
    }
    return nilai;
  }

  public String display() {
    return kode + " - " + nama + " - Index: " + index + " -  SKS: " + sks + " - Dosen: " + dosenPengampu + " - Semester: " + semester;
  }

  // Fungsi untuk mendapatkan nilai SKS
  public int getSKS() {
    return sks;
  }

  // Fungsi untuk mendapatkan nama dosen pengampu
  public String getDosenPengampu() {
    return dosenPengampu;
  }

  // Fungsi untuk mengatur nama dosen pengampu
  public void setDosenPengampu(String dosenPengampu) {
    this.dosenPengampu = dosenPengampu;
  }

  // Fungsi untuk mendapatkan semester
  public int getSemester() {
    return semester;
  }

  // Fungsi untuk mengatur semester
  public void setSemester(int semester) {
    this.semester = semester;
  }
}
