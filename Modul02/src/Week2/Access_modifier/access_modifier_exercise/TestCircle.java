package Week2.Access_modifier.access_modifier_exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle() ;
        Circle circle2 = new Circle(5) ;

        System.out.println("Radius circle1  = " + circle1.getRadius());
        System.out.println("Area circle1 = " + circle1.getArea());
        System.out.println("Radius circle2 = " + circle2.getRadius());
        System.out.println("Area circle2 = " + circle2.getArea());
    }
}
