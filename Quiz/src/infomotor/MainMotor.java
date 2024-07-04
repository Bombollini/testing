
package infomotor;

//6
public class MainMotor {
    
    public static void main(String[] args) {
    //7
    Motor motorku = new Motor();
    
    motorku.setMerk("Honda");
    motorku.setJenis("Matic");
    motorku.setTahun(2012);
    
    System.out.println("Merk: " +  motorku.getMerk());
    System.out.println("Jenis: " + motorku.getJenis());
    System.out.println("Tahun: " + motorku.getTahun());

    //10
    Motor konsMotor = new Motor("Yamaha","Manual",2018);
    
    //11
    Motor girMotor = new Motor();
    System.out.println("GIR MOTOR");
    girMotor.setGirTambah(2);
    System.out.println("Gir sekarang" + girMotor.getGirTambah());
    girMotor.setGirKurang(1);
    System.out.println("Gir sekarang" + girMotor.getGirKurang());
    } 
    
    //12
    MotorListrik motorL = new MotorListrik();
           
}
