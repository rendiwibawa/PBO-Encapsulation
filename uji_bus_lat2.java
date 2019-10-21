package Latihan2;
public class uji_bus_lat2 {
    public static void main(String[] args) {
        //membuat object bus besar dri kelas bus
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
   
}
