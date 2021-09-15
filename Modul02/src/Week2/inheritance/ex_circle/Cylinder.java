package Week2.inheritance.ex_circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(int radius , String color , double height ){
        super(radius, color);
        this.height = height ;
    }

    public double getHeight(){
        return this.height ;
    }
    @Override
    public double getArea(){
        return  super.getArea() * 2 + super.getPerimeter() * height ;
    }
    public  double getVolume(){
        return super.getArea() * height ;
    }
    @Override
    public String toString(){
        return "Cylinder have area = " + getArea()+ ", volume = " +  getVolume();
    }
}
