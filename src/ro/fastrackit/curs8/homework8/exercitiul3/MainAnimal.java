package ro.fastrackit.curs8.homework8.exercitiul3;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(animal.eat());
        System.out.println(animal.talk());
        System.out.println(animal.walk());
        animal =  new Dog();
        System.out.println(animal.eat());
        System.out.println(animal.walk());
        System.out.println(animal.talk());
    }
}
