public class abstractExample {

    public static void main(String[] args) throws Exception {
        abstract class Shape{
            abstract void draw();
        }
    
        class Polyline extends Shape{
            void draw(){
                System.out.println("N");
            }
        }
    
        class Rectangle extends Shape{
            void draw(){
                System.out.println("□");
            }
        }
    
        class Circle extends Shape{
            void draw(){
                System.out.println("○");
            }
        }

        Shape[] shapes = new Shape[3];
        shapes[0] = new Polyline();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
