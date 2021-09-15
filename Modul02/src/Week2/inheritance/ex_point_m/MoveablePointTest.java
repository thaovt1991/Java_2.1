package Week2.inheritance.ex_point_m;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveable = new MoveablePoint();
        System.out.println(moveable);
        MoveablePoint m2 = new MoveablePoint(5.6f,7.3f ,5,7);
        System.out.println(m2);
        m2.Move();
        m2.Move();
        m2.Move();
        m2.Move();
        m2.Move();
        System.out.print("After move : ");
        System.out.println(m2);
        MoveablePoint m3 = new MoveablePoint(7,10);
        System.out.println(m3);
        m3.Move();
        System.out.print("After move : ");
        System.out.println(m3);
    }
}
