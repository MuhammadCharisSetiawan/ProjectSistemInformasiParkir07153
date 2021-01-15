package Controller;
import Entity.Charis07153_NotaPerjamEntity;
import Entity.Charis07153_NotaPerhariEntity;
import java.util.Date;

public class Charis07153_NotaController {
    int menu;
    public void insertNotaJam(int Harga, int NoNota, String kondisi,Date TanggalMasuk, String JamMasuk, String MenitMasuk, int JamKeluar, int MenitKeluar){
        Charis07153_AllObjectModel.notaperjamModel.insert(new Charis07153_NotaPerjamEntity(Harga, NoNota,kondisi, TanggalMasuk, JamMasuk, MenitMasuk, JamKeluar, MenitKeluar));
    }
    
    public Charis07153_NotaPerjamEntity showDataNotajam(int index){
        return Charis07153_AllObjectModel.notaperjamModel.showData(index);
    }
    
    public void deleteNotaJam(int index){
        Charis07153_AllObjectModel.notaperjamModel.delete(index);
    }
    public int loopingJam(){
        return Charis07153_AllObjectModel.notaperjamModel.loopingJam();
    }
    public int loopingHari(){
        return Charis07153_AllObjectModel.notaperhariModel.loopingHari();
    }
    public void insertNotaHari(String TanggalMasuk,String BulanMasuk,String TahunMasuk, int TanggalKeluar,int BulanKeluar,int TahunKeluar, String Kondisi, int Harga,int NoNota){
        Charis07153_AllObjectModel.notaperhariModel.insert(new Charis07153_NotaPerhariEntity(TanggalMasuk, BulanMasuk, TahunMasuk, TanggalKeluar, BulanKeluar, TahunKeluar, Kondisi, Harga, NoNota));
    }
    
    public Charis07153_NotaPerhariEntity showDataNotaHari(int index){
        return Charis07153_AllObjectModel.notaperhariModel.showData(index);
    }
    
    public void deleteNotaHari(int index){
        Charis07153_AllObjectModel.notaperhariModel.delete(index);
    }
    public int getMenu(){
        return menu;
    }
    public void setMenu(int menu) {
        this.menu = menu;
    }
}