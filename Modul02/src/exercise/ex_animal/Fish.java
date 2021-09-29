package exercise.ex_animal;

public class Fish implements IMarineAnimal {
    private  int ID ;
    private String name = "Fish" ;
    private int Age ;
    @Override
    public void Move(){
        System.out.println("Fish move Swim");
    }
    public String getType(){
        return  "Fish" ;
    }
    @Override
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
    @Override
    public String toString(){
        return "Animal Type : " + getType()+ ",  ID = " + getID() + ", Name = '" + getName() + "', Age = " +  getAge() ;
    }
}
