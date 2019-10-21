package Latihan4;
public class Bus4 {
    public int penumpang;
    public int maxpenumpang;
    
    public Bus4(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    //method Mutator
    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else
        {
        this.penumpang=temp;
        }
    }
public void getpenumpang(int password){
    if(password==24){
        System.out.println("Password Benar");
    }else{
        System.out.println("Password salah");
    }
}
public void cetakpenumpang(){
    System.out.println("Penumpang bus sekarang ="+penumpang);
    System.out.println("Maksimum penumpang yang seharusnya adalah ="+maxpenumpang);
}

}
