interface HasGetAreaMethod{
    double getArea();
}

abstract class Shape{
    abstract void draw();
}    
class Polyline extends Shape{
    void draw(){
        System.out.println("N");
    }   
}

class Rectangle extends Shape implements HasGetAreaMethod{
    void draw(){
        System.out.println("□");
    }
    public double getArea(){
        return 1.0;
    }
}

class Circle extends Shape implements HasGetAreaMethod{
    void draw(){
        System.out.println("○");
    }
    public double getArea(){
        return 1.0;
    }
}

class Polygon extends Shape implements HasGetAreaMethod{
    void draw(){
        System.out.println("凸");
    }
    public double getArea(){
        return 1.0;
    }
}

public class abstractExample {
    public static void main(String[] args) throws Exception {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Polyline();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }

        HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3];
        closedShapes[0] = new Polygon();
        closedShapes[1] = new Rectangle();
        closedShapes[2] = new Circle();

        for (int i = 0; i < closedShapes.length; i++) {
            System.out.println(closedShapes[i].getArea());
        }
    }
}
