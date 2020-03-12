public class main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.getAnimal("dog");
        System.out.println(animal.makeSound());

        Animal animal1 = animalFactory.getAnimal("cat");
        System.out.println(animal1.makeSound());
    }
}
