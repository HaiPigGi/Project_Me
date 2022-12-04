
import java.time.LocalDate;

public class Pasien {
    
    protected String nrm;
    protected String nama;
    protected String alamat;
    protected String dokter;
    protected LocalDate tahunLahir;

    public Pasien (){
        
    }
    
    
    public Pasien(String nrm, String nama, String alamat, String dokter, LocalDate tahunLahir) {
        this.nrm = nrm;
        this.nama = nama;
        this.alamat = alamat;
        this.dokter = dokter;
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

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    public LocalDate getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(LocalDate tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    @Override
    public String toString() {
        return "Pasien{" + "nrm=" + nrm + ", nama=" + nama + ", alamat=" + alamat + ", dokter=" + dokter + ", tahunLahir=" + tahunLahir + '}';
    }
    
    
    
    
    
}
