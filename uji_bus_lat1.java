package Latihan1;
public class uji_bus_lat1 {
    public static void main(String[] args) {
        Bus1 busMini=new Bus1();
        busMini.penumpang=5;
        busMini.maxPenumpang=15;
        busMini.cetak();
        busMini.penumpang = busMini.penumpang +5;
        busMini.cetak();
        busMini.penumpang = busMini.penumpang -2;
        busMini.cetak();
        busMini.penumpang = busMini.penumpang +8;
        busMini.cetak();
    }
   
}
