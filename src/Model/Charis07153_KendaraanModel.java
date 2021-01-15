package Model;

import Entity.Charis07153_KendaraanEntity;
import java.util.ArrayList;

public class Charis07153_KendaraanModel{
    private ArrayList <Charis07153_KendaraanEntity> kendaraanEntityArrayList;
    
    public Charis07153_KendaraanModel() {
        kendaraanEntityArrayList = new ArrayList <Charis07153_KendaraanEntity>();
    }
    
    public void insert(Charis07153_KendaraanEntity kendaraan){
        kendaraanEntityArrayList.add(kendaraan);
    }
    
    public Charis07153_KendaraanEntity showData(int index){
        return kendaraanEntityArrayList.get(index);
    }
    
    public void delete(int index){
        kendaraanEntityArrayList.remove(index);
    } 
    public int cekdata(String platnomer){   
        int loop = 0;
        for (Charis07153_KendaraanEntity kendaraanEntity : kendaraanEntityArrayList) {
            if (kendaraanEntity.getPlatNomor().equals(platnomer)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
}