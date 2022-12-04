
import java.time.LocalDate;


public class Rawat_Jalan extends Pasien{
    protected String jadwal;
    protected String tindakan;
    
   public Rawat_Jalan(String jadwal, String tindakan, String nrm, String nama, String alamat, String dokter, LocalDate tahunLahir) {
        super(nrm, nama, alamat, dokter, tahunLahir);
        this.jadwal = jadwal;
        this.tindakan = tindakan;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getTindakan() {
        return tindakan;
    }

    public void setTindakan(String tindakan) {
        this.tindakan = tindakan;
    }

    @Override
    public String toString() {
        return "RawatJalan_215314102{" + "jadwal=" + jadwal + ", tindakan=" + tindakan + '}';
    }
    
    
    
}
