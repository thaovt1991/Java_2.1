package Week2.abtract_class_and_interface.colorable;

public class Square implements Colorable {

    private double side;
    private String color;
    boolean filled;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", color =  " + getColor()
                + ", Area=" +
                +getArea() + ", Perimeter = " + getPerimeter()
                + (isFilled() ? "filled" : "not filed");
    }

    @Override
    public void howtoColor() {
        if (isFilled()) {
            System.out.println("Color all four sides with  " + color + " color");
        }
    }
}
