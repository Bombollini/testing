
package infomotor;

//3
public class Motor {
    
    
    //4
    private String merk,jenis;
    private int tahun,gir;
    
    public Motor(){
        System.out.println("   ");
    }
    //5
    void setMerk(String merk){
      this.merk = merk;  
    }
    
    void setJenis(String jenis){
      this.jenis = jenis;
    }
    
    void setTahun (int tahun){
      this.tahun = tahun;
    }
    
    String getMerk(){
        return merk;
    }
    
    String getJenis(){
        return jenis;
    }
    
    int getTahun(){
        return tahun;
    }
    
    //8
    public Motor(String merk, String jenis, int tahun){
       this.jenis = jenis;
       this.merk = merk;
       this.tahun = tahun;
    }
    
    //9
     void setGirTambah(int girTambah){
        gir = gir + girTambah;
    }
    void setGirKurang(int girKurang){
        gir = gir - girKurang;
    }
    
    int getGirTambah (){
        return gir;
    }
    int getGirKurang (){
        return gir;
    }
}
