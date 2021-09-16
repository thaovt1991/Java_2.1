package Week2.abtract_class_and_interface.comparato_Circle;

import Week2.inheritance.geometry.Circle;

import java.util.Comparator ;
public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
