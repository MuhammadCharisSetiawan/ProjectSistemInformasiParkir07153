package Controller;
import Entity.Charis07153_KendaraanEntity;

public class Charis07153_KendaraanController {
    public void insert (String PlatNomor,String JenisKendaraan, String Kondisi){
        Charis07153_AllObjectModel.kendaraanModel.insert(new Charis07153_KendaraanEntity(PlatNomor, JenisKendaraan, Kondisi));
    
    }
    
    public Charis07153_KendaraanEntity showData(int index){
       return Charis07153_AllObjectModel.kendaraanModel.showData(index);
    }
    
    public void delete(int index){
        Charis07153_AllObjectModel.kendaraanModel.delete(index);
    }
    public int cekdataAkun(String platnomer){
        int cekdata = Charis07153_AllObjectModel.kendaraanModel.cekdata(platnomer);
        return cekdata;
    }
}
