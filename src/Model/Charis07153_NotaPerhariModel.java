package Model;

import Entity.Charis07153_NotaPerhariEntity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Charis07153_NotaPerhariModel{
    private ArrayList <Charis07153_NotaPerhariEntity> notaperhariEntityArrayList;

    public Charis07153_NotaPerhariModel() {
        notaperhariEntityArrayList = new ArrayList <Charis07153_NotaPerhariEntity>();
    }
    
    public void insert(Charis07153_NotaPerhariEntity notaPerhari){
        notaperhariEntityArrayList.add(notaPerhari);
    }
    
    public Charis07153_NotaPerhariEntity showData(int index){
        return notaperhariEntityArrayList.get(index);
    }
    
    public void delete(int index){
        notaperhariEntityArrayList.remove(index);
    }
    
    public int loopingHari(){
        int ukuran = notaperhariEntityArrayList.size();
        return ukuran;
    }
}