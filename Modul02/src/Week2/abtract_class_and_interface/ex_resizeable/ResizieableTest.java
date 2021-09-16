package Week2.abtract_class_and_interface.ex_resizeable;

public class ResizieableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape a : shapes){
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
            if (a instanceof Circle){
                Circle obj = (Circle) a ;
                System.out.println("After circle have : " + obj.getRadius() + ", Area = " + obj.getArea() +", perimeter ="+ obj.getPerimeter());
            }
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
