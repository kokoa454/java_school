public class StaticMethodExample {
    public static void main(String[] args) {
        System.out.println("底辺が10, 高さが5の三角形の面積は" + SimpleCalc.getTriangleArea(10.0, 5.0) + "です");
    }
}

class SimpleCalc{
    static double getTriangleArea(double base, double height){
        return base * height / 2.0;
    }
}
