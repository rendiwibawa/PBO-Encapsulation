package Latihan3;
public class TestSiswa {
    public static void main(String[] args) {
        
        encapSiswa siswa = new encapSiswa();
        siswa.setName("Julian");
        siswa.setAge(17);
        siswa.setAddres("Malang");
        
        System.out.println("Name :"+siswa.getName());
        System.out.println("Age :"+siswa.getAge());
        System.out.println("Address :"+siswa.getAddres());
    }
}
