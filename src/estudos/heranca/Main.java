package estudos.heranca;

public class Main {
    public static void main(String[] args) {
    // brincando com herança
        Cat cat = new Cat();
        Dog dog = new Dog();
        Plant plant = new Plant();

        System.out.println("Dog: ");
        System.out.println("A dog has: " + dog.Life() + " life");
        dog.eat();
        System.out.println("Alive: " + dog.isAlive());

        System.out.println();

        System.out.println("Cat: ");
        System.out.println("A cat has: " + cat.Life() + " life");
        cat.eat();
        System.out.println("Alive: " + cat.isAlive());
    }
}
