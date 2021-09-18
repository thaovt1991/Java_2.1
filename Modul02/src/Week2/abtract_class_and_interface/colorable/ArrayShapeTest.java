package Week2.abtract_class_and_interface.colorable;

public class ArrayShapeTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5);
        shape[1] = new Rectangle(5, 6);
        shape[2] = new Square(5);

        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Circle) {
                System.out.println("Area Circle : " + ((Circle) x).getArea());
            }
            if (x instanceof Rectangle) {
                System.out.println("Area Rectangle : " + ((Rectangle) x).getArea());
            }
            if (x instanceof Square){
                System.out.println("Area Square : " + ((Square) x).getArea());
            }
            if (x instanceof Colorable){
                ((Colorable) x).howToColor();
            }
        }
    }
}
