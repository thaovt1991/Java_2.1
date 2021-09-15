package Week2.abtract_class_and_interface.animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken : cluck-cluck!" ;
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
