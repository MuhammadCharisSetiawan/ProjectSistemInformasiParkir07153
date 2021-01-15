package Model;
import Entity.Charis07153_NotaPerjamEntity;
import java.util.ArrayList;

public class Charis07153_NotaPerjamModel{
    private ArrayList <Charis07153_NotaPerjamEntity> notaperjamEntityArrayList;
    public Charis07153_NotaPerjamModel() {
        notaperjamEntityArrayList = new ArrayList <Charis07153_NotaPerjamEntity>();
    }
    
    public void insert(Charis07153_NotaPerjamEntity notaPerhari){
        notaperjamEntityArrayList.add(notaPerhari);
    }
    
    public Charis07153_NotaPerjamEntity showData(int index){
        return notaperjamEntityArrayList.get(index);
    }
    
    public void delete(int index){
        notaperjamEntityArrayList.remove(index);
    }
    
    public int loopingJam(){
        int ukuran = notaperjamEntityArrayList.size();
        return ukuran;
    }
}