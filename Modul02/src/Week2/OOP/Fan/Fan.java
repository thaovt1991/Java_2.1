package Week2.OOP.Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(double radius, String color, boolean on, int speed) {
        this.radius = radius;
        this.color = color;
        this.on = on;
        this.speed = speed;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean checkOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String str;
        if (this.checkOn()) {
            str = "Fan is on , fan's speed " + this.speed + ", fan's color " + this.color + ", fan's radius " + this.radius;
        } else {
            str = "Fan is off, fan's color " + this.color + ", fan's radius " + this.radius;
        }
        return str;
    }
}

