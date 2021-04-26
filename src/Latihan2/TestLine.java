package Latihan2;
public class TestLine {
    public static void main(String[] args) {
        Line a = new Line(4,9,8,8);
        Line b = new Line(2,2,10,8);
        
        System.out.println("Panjang Garis A : "+ a.getLength());
        System.out.println("Panjang Garis B : "+b.getLength());
        
        System.out.println("\nApakah Garis A > Garis B : " + a.isGreater(a, b));
        System.out.println("Apakah Garis A < Garis B : " + a.isLess(a, b));
        System.out.println("Apakah Garis A == Garis B : "+ a.isEqual(a, b));
        
        System.out.println("\nApakah Garis B > Garis A : "+b.isGreater(a, b));
        System.out.println("Apakah Garis B < Garis A : "+b.isLess(a, b));
        System.out.println("Apakah Garis B == Garis A  "+b.isEqual(a, b));
    }
    
}
