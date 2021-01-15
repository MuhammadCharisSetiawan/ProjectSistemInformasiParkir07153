package Entity;

public abstract class Charis07153_NotaAbstractEntity {
    protected int Harga;
    protected String Kondisi;
    protected int NoNota;

    public Charis07153_NotaAbstractEntity(int Harga,String Kondisi,int NoNota) {
        this.Harga = Harga;
        this.Kondisi = Kondisi;
        this.NoNota = NoNota;
    }
    
    public Charis07153_NotaAbstractEntity (){
    
    }
    
    public abstract int getHarga();
    
    public int getNoNota() {
        return NoNota;
    }

    public void setNoNota(int NoNota) {
        this.NoNota = NoNota;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String Kondisi) {
        this.Kondisi = Kondisi;
    }    
}
