package Week2.OOP.Fan;

public class FanRun {
    public static void main(String[] args) {
        Fan fan1 = new Fan(10,"yellow",true, 3) ;
        Fan fan2 = new Fan(5,"blue", false ,0);
        System.out.println("This Fan 1 : " + fan1.toString());
        System.out.println("This Fan 2 : " + fan2.toString());
    }
}
