package exercise.ex_animal;

public class Cat implements ITerrestrialAnimal{
    private  int ID ;
    private String name = "Crocodile" ;
    private int Age ;

    @Override
    public void Move(){
        System.out.println("Cat move run");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public  String getType(){
        return "Cat" ;
    }
    @Override
    public String toString(){
        return "Animal Type : " + getType()+ ",  ID = " + getID() + ", Name = '" + getName() + "', Age = " +  getAge() ;
    }
}
