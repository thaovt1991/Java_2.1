package Week2.Access_modifier.access_modifier_exercise;

public class Circle {
    private double radius = 1.0;
    private  String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

