
import java.time.LocalDate;


public class Dokter {
     protected String nrm;
    protected String nama;
    protected String alamat;
    protected String Spesialis;
    protected LocalDate tahunLahir;
    
    public Dokter() {
    
}
    
    public Dokter (String nrm, String nama, String alamat, String spesialis, LocalDate tahunLahir) {
        this.nrm = nrm;
        this.nama = nama;
        this.alamat = alamat;
        this.Spesialis = spesialis;
        this.tahunLahir = tahunLahir;
    }

    public String getNrm() {
        return nrm;
    }

    public void setNrm(String nrm) {
        this.nrm = nrm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    public LocalDate getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(LocalDate tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    
}
