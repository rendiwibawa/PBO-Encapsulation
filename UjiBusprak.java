package praktikum1;
public class UjiBusprak {
    public static void main(String[]args) {
        //membuat object dari kelas bus
        Busprak Bus = new Busprak(210);
        Bus.cetakpenumpang();

        //penambahan penumpang
           System.out.println("\n");
        Bus.getPenumpang(24);//ini untuk passwordnya
        Bus.cetakpenumpang();
        
         //penambahan penumpang
           System.out.println("\n");
        Bus.getPenumpang(17);//ini untuk passwordnya
        Bus.cetakpenumpang();
        
         //penambahan penumpang
        System.out.println("\n");
        Bus.getPenumpang(24);//ini untuk passwordnya
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
        Bus.getPenumpang(24);//ini untuk passwordnya
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
        Bus.getPenumpang(24);//ini untuk passwordnya
        Bus.cetakpenumpang();
        
        

        
        
        System.out.println("Rata-rata penumpang :"+Bus.getAverage()+" kg");
        System.out.println("Jumlah penumpang sekarang :"+Bus.counter());
    }
    
}
