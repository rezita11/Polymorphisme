package Abstrac;
public final class LaptopCetak {
    //final variable/konstanta
    private final String barang = "Laptop";
    //final method
    private final void cetak(Laptop [] ob, String pemilik){
        System.out.println("Nama Barang : "+barang);
        System.out.println("");
        //polimorfisme
        for (int i=0; i<ob.length; i++){
            ob[i].getMerk();
            ob[i].getPemilik();
            ob[i].tampil();
            ob[i].hapus();
            System.out.println("###################");
        }
        ob = null;
        pemilik = null;
    }
    public static void main (String []args){
        String pemilik = "Rezita";
        Laptop[]ob = 
        {   new LaptopAsus("Asus"),
            new LaptopDell("Dell"),
            new LaptopThosiba("Thosiba")
        };
        LaptopCetak abc = new LaptopCetak();
        abc.cetak(ob, pemilik);
        
        pemilik = null;
        ob = null;
        abc = null;
    }
    
}
