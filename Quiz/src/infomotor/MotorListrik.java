
package infomotor;
//12
public class MotorListrik extends Motor {
    //13
    private String watt;
    private int harga;
    
    void setWatt (String watt){
        this.watt = watt;
    }
    
    void setHarga (int harga){
        this.harga = harga;
    }
    
    String getWatt (){
        return watt;
    }
    int getHarga (){
        return harga;
    }
    
}
