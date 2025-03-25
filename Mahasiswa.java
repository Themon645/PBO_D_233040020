package pertemuan_7.PBO_D_233040020;

public class Mahasiswa {
  private String NRP;
  private String nama;

  public Mahasiswa() {

  }

  public Mahasiswa(String nrp, String nama) {
    super();
    NRP=nrp;
    this.nama=nama;
  }
  public String display() {
    return "NRP: "+ NRP+", Nama: "+ nama;
  }

  public void setMhs(String nrp, String nama) {
    this.NRP=nrp;
    this.nama=nama;
  }
  public String getNrp() {
    return NRP;
  }
  public String getNama() {
    return nama;
  } 
  
}
