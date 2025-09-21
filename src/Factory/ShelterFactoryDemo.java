package Factory;

public class ShelterFactoryDemo {
    public static void main(String[] args) {
        ShelterAnimal animal1 = AnimalRegistrationFactory.registerAnimal("dog");
        animal1.info();

        ShelterAnimal animal2 = AnimalRegistrationFactory.registerAnimal("cat");
        animal2.info();

        ShelterAnimal animal3 = AnimalRegistrationFactory.registerAnimal("rabbit");
        animal3.info();
    }
}