package Week2.abtract_class_and_interface.colorable;

public class SquareColorTest {
    public static void main(String[] args) {
        Square square = new Square(8,"black",true);
        System.out.println(square);
        square.howtoColor();
    }
}
