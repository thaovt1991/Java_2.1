package exercise.ex_animal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnimalManagementSystem {
    static IAnimal[] animals = new IAnimal [10];
    static int idAnimal = 0;

    public static void insertSize() {
        if (getIdAnimal() == animals.length) {
            int newSize = animals.length * 2 + 1;
            animals = Arrays.copyOf(animals, newSize);
        }
    }


    public static int getIdAnimal() {
        return idAnimal;
    }

    public static void setIdAnimal(int idNew) {
        idAnimal = idNew;
    }

    public static void createCat() {
        System.out.println("Create new Cat !");
        insertSize();
        Cat cat = new Cat();
        cat.setID(getIdAnimal() + 1);
        setIdAnimal(getIdAnimal() + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Name cat : ");
        cat.setName(input.nextLine());
        System.out.println("Age of cat " + cat.getName() + ": ");
        cat.setAge(input.nextInt());
        animals[getIdAnimal()] = cat ;
    }

    public static void createFish() {
        System.out.println("Create new Fish !");
        insertSize();
        Fish fish = new Fish();
        fish.setID(getIdAnimal() + 1);
        setIdAnimal(getIdAnimal() + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Name fish : ");
        fish.setName(input.nextLine());
        System.out.println("Age of fish " + fish.getName() + ": ");
        fish.setAge(input.nextInt());
        animals[getIdAnimal()] = fish ;
    }

    public static void createCrocodile() {
        System.out.println("Create new Crocodile !");
        insertSize();
        Crocodile crocodile = new Crocodile();
        crocodile.setID(getIdAnimal() + 1);
        setIdAnimal(getIdAnimal() + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Name Crocodile : ");
        crocodile.setName(input.nextLine());
        System.out.println("Age of crocodile " + crocodile.getName() + ": ");
        crocodile.setAge(input.nextInt());
        animals[getIdAnimal()] = crocodile ;
    }

    public static void displayTerrestrialAnimal() {
        int count = 0;
        String display = "";
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof ITerrestrialAnimal) {
                count++;
                display += count + ". " + animals[i].toString() + "\n";

            }
        }
        System.out.println("Have " + count + " terrestrial animal : ");
        System.out.println(display);
    }

    public static void displayMarineAnimal() {
        int count = 0;
        String display = "";
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof IMarineAnimal) {
                count++;
                display += count + ". " + animals[i].toString() + "\n";

            }
        }
        System.out.println("Have " + count + " marine animal : ");
        System.out.println(display);
    }

    public static void displayAllAnimal() {
        int count = 0;
        String display = "";
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
                display += count + ". " + animals[i].toString() + "\n";
            }
        }
        System.out.println("there are all " + count + " animals");
        System.out.println(display);
    }

    public static void deleteWithId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id need delete : ");
        int id = scanner.nextInt();
        if(!isIdAnimal(id)){
            System.out.println("Id not in list animal !");
        }
        for (int i = 0; i < animals.length; i++) {
            if (getIdAnimals(animals[i]) == id) {
                animals[i] = null;
                break;
            }
        }
        displayAllAnimal();
    }
    public static boolean isIdAnimal(int id){
        for (int i = 0; i < animals.length; i++) {
            if (getIdAnimals(animals[i]) == id)
                return true;
        }
        return false ;
    }

    public static int getIdAnimals(IAnimal animal) {
        if (animal instanceof Cat)
            return ((Cat) animal).getID();
        if (animal instanceof Fish)
            return ((Fish) animal).getID();
        if (animal instanceof Crocodile)
        return ((Crocodile) animal).getID();
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

        char choice ;
        do {
            System.out.println("======MENU==================");
            System.out.println("1. Creat Crocodile");
            System.out.println("2. Creat Cat");
            System.out.println("3. Create Fish");
            System.out.println("4. View Terrestrial Animal");
            System.out.println("5. View Marine Animal");
            System.out.println("6. View All Animal");
            System.out.println("7. Delete Animal");
            System.out.println("8. Exit");
            System.out.println("==============================");
            System.out.print("Choice : ");
            Scanner input = new Scanner(System.in);

            choice = input.nextLine().charAt(0);
            switch (choice){
                case '1':
                    createCrocodile();
                    break;
                case '2':
                    createCat();
                    break;
                case '3':
                    createFish();
                    break;
                case '4':
                    displayTerrestrialAnimal();
                    break;
                case '5':
                    displayMarineAnimal();
                    break;
                case '6' :
                    displayAllAnimal();
                    break;
                case '7':
                    deleteWithId();
                    break;
                case '8':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choice again ! , Because choice not in list choice menu !");
            }
        }while (choice != '8') ;

    }

}

