package Entity;

public class Charis07153_KendaraanEntity{
    private String PlatNomor;
    private String JenisKendaraan;
    private String Kondisi;  

    public Charis07153_KendaraanEntity(String PlatNomor,String JenisKendaraan, String Kondisi){
        this.PlatNomor = PlatNomor;
        this.JenisKendaraan = JenisKendaraan;
        this.Kondisi = Kondisi;
    }

    public String getPlatNomor() {
        return PlatNomor;
    }

    public String getJenisKendaraan() {
        return JenisKendaraan;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String Kondisi) {
        this.Kondisi = Kondisi;
    }
}
