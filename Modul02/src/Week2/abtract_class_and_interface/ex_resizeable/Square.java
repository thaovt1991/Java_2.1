package Week2.abtract_class_and_interface.ex_resizeable;


public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return  side * side ;
    }

    public double getPerimeter(){
        return side * 4 ;
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                +getArea() + ", Perimeter = " + getPerimeter() ;
    }



    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
