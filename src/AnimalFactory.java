public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("dog".equalsIgnoreCase(type))
            return new Dog();
        else
            return new Cat();
    }
}
