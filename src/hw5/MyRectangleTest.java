package hw5;


public class MyRectangleTest {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle();
        r1.setWidth(10);   
        r1.setDepth(20);
        System.out.println("不帶參數建構子的長方形面積: " + r1.getArea());  

        MyRectangle r2 = new MyRectangle(10, 20);  
        System.out.println("帶參數建構子的長方形面積: " + r2.getArea());  
    }
}
