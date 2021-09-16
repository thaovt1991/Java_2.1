package Week2.abtract_class_and_interface.comparable;

import  Week2.inheritance.geometry.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    @Override
    public int compareTo(ComparableCircle obj) {
        if (getRadius() > obj.getRadius()) return 1;
        else if (getRadius() < obj.getRadius()) return -1;
        else return 1;
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


}
