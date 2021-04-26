package Praktikum;
public class TestRect {
    public static void main(String[] args) {
        Rect rect1 = new Rect(2,2,6,6);
        Rect rect2 = new Rect(4,3,6,7);
        
        System.out.println("<" + rect2.x1 + "," + rect2.y1 + "> is inside the union");
        System.out.println(rect1 + " union " + rect2 + " = " + rect1.union(rect2));
        System.out.println(rect1 + " intersection " + rect2 + " = " + rect1.intersection(rect2));
    }
    
}
