package praktikum1;
public class Busprak {
    private double penumpang;
    private double maxpenumpang;
    private int counter;
    
    //konstruksi kelas bus
    public Busprak(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    
    //method Mutator untuk penambahan penumpang
    public void addpenumpang(int penumpang) {
        double temp;
        temp = this.penumpang+penumpang;
        
        if(temp>=maxpenumpang){
            System.out.println("=====Berat penumpang melebihi kuota=====");
        }else{
        this.penumpang=temp;
        counter++;
        }
    }
    //module password
public void getPenumpang(int password){
    if(password==24){
        System.out.println("Password Benar");
        addpenumpang(55);
       
        
    }else{
        System.out.println("Password salah !!!\nData tidak dapat di ubah");
    }
}
public void cetakpenumpang(){
    System.out.println("Berat Penumpang bus sekarang = "+penumpang+" Kg");
    System.out.println("Maksimum berat penumpang yang seharusnya adalah = "+maxpenumpang+" Kg");
}
public double getAverage(){
    return penumpang/counter;
}
public int counter(){
    return counter;
}
}
