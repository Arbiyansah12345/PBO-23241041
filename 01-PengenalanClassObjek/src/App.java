// membuat class sebagai tempalate
class Mahasiswa{
   // memebuat ciri ciri atau atribut objek
   String nama;
   String nim;
   String prodi;
   String ipk;
   int umur;

}




public class App {
    public static void main(String[]args) throws Exception {
        
        // inatansiasi atau membuat objek
        Mahasiswa mhs_1 = new Mahasiswa();
        Mahasiswa mhs_2 = new Mahasiswa();

        //pengisian data objek
        mhs_1.nama = "SAPUTRA";
        mhs_1.nim = "23241042";
        mhs_1.prodi = "biologi";
        mhs_1.ipk= "3.40";
        mhs_1.umur = 18;

        mhs_2.nama = "ARBIYAN";
        mhs_2.nim = "23241041";
        mhs_2.prodi = "PTI";
        mhs_2.ipk= "3.90";
        mhs_2.umur = 20;


        // Cetak data 
        System.out.println("Nama Mahasiswa :" + mhs_1.nama);
         System.out.println("nim :" + mhs_1.nim);
         System.out.println("prodi :" + mhs_1.prodi);
         System.out.println("ipk :" + mhs_1.ipk);
         System.out.println("umur :" + mhs_1.umur);

         System.out.println("Nama Mahasiswa :" + mhs_2.nama);
         System.out.println("nim :" + mhs_2.nim);
         System.out.println("prodi :" + mhs_2.prodi);
         System.out.println("ipk :" + mhs_2.ipk);
         System.out.println("umur :" + mhs_2.umur);


        
        
        


    }
}



        
    
        
    