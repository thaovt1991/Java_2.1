package week5.DesignPatterns.AnimalFactory;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
