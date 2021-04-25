package Tugas1;
public class OperasiPenjumlahan extends OperasiBilanganAbs {
    public OperasiPenjumlahan (double a, double b){
        set_A(a);
        set_B(b);
    }
    @Override
    protected void set_A(double a){
        this.a = a;
    }
    @Override
    protected double get_A(){
        return a;
    }
    @Override
    protected void set_B(double b) {
        this.b = b;
    }
    @Override
    protected double get_B() {
        return b;
    }
    @Override
    protected void set_C(){
        this.c = c;
    }
    @Override
    protected double get_C(){
        return c;
    }
    @Override
    protected void tampil(){
        c = a + b;
        System.out.println("Bilangan A + Bilangan B = ");
        System.out.println(+get_A()+" + "+get_B()+" = " +c
                +"\n");
    }

}
