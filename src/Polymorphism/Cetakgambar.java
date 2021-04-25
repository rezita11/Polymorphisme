package Polymorphism;
public class Cetakgambar extends Bentuk {
    private void tampil(Bentuk[] obj){
        //Polimorfisme
        //Memanggil method yang sama yaitu method gambar() dna hapus()
        //pada masing" class
        for (int i=0; i<obj.length; i++){
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("========");
        }
    }
    public static void main (String[]args){
        Bentuk[] obj = 
        {   new Lingkaran(),
            new Elips(),
            new Segitiga()
        };
        Cetakgambar cetak = new Cetakgambar();
        //Menampiplkan method gambar() dan hapus() pada class Bnetuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("=======");
        
        //overriding
        //menumpuk method gambar() & hapus() pada class Bentuk (superclass)
        //yaitu class Lingkaran, Elips, dan Segitiga
        cetak.tampil(obj);
    } 
    
}
