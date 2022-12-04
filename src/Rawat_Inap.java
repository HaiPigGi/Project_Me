
import java.time.LocalDate;


public class Rawat_Inap extends Pasien{
    protected String kamar;
    protected LocalDate tglMasuk;

   public Rawat_Inap(String Kamar, LocalDate tanggalMasuk, String nrm, String nama, String alamat, String dokter, LocalDate tahunLahir) {
        super(nrm, nama, alamat, dokter, tahunLahir);
        this.kamar = Kamar;
        this.tglMasuk = tanggalMasuk;
    }
    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public LocalDate getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(LocalDate tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    @Override
    public String toString() {
        return "RawatInap{" + "kamar=" + kamar + ", tglMasuk=" + tglMasuk + '}';
    }
    
    
}
