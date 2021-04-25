package Tugas1;
public class OperasiBilanganAbsCetak {
    private final void cetakSemua(OperasiBilanganAbs[] ob, double a, double b){
        System.out.println("Bilangan a = "+a);
        System.out.println("Bilangan b = "+b);
        System.out.println();
        for(int i=0; i<ob.length; i++){
            ob[i].get_A();
            ob[i].get_B();
            ob[i].tampil();
        }
    }
    public static void main (String[]args){
            OperasiBilanganAbsCetak abc = new OperasiBilanganAbsCetak();
            OperasiBilanganAbs[]ob = {
                new OperasiPenjumlahan(10.5, 4.5),
                new OperasiPengurangan(10.5, 4.5),
                new OperasiPerkalian(10.5, 4.5),
                new OperasiPembagian(10.5, 4.5)
            };
            abc.cetakSemua(ob, 10.5, 4.5);
        }
    
}
