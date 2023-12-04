import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Person yuval = new Person("Yuval","Cohen", 53, "26 bergman st, Rishon Lezion");
        yuval.describe();
        Person itai = new Person();
        itai.describe();
        Employee carl = new Employee("Carl Cracker", 75000, 1987,12,15);
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Employee tony = new Employee("Tony Tester", 40000, 1990, 3, 15);

        carl.raiseSalary(5);
        harry.raiseSalary(5);
        tony.raiseSalary(5);

        carl.showInfo();
        harry.showInfo();
        tony.showInfo();

        createDog();
        printDog();
    }

    public static void createDog() {
        Dog dog = new Dog(3, "Golden Retriever", "Buddy");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Specie: " + dog.getSpecie());
    }

    public static void printDog() {
        Dog dog = new Dog(3, "Golden Retriever", "Buddy");
        System.out.println(dog.toString());
        System.out.println(dog);

    }

    public static void createMeals() {
        Meal meal1 = new Meal("Hamburger", false, 50);
        Meal meal3 = new Meal("Salad", true, 40);
    }

    public static void createHouses() {
        House house1 = new House("26 Bergman st", 156.5, "Yuval Cohen");
        House house2 = new House("Sokolov 110 holon", 89.2);
    }

}