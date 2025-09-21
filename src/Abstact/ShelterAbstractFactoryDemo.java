package Abstact;

public class ShelterAbstractFactoryDemo {
    private final ShelterDog dog;
    private final ShelterCat cat;

    public ShelterAbstractFactoryDemo(ShelterFactory factory) {
        this.dog = factory.createDog();
        this.cat = factory.createCat();
    }

    public void showAnimals() {
        dog.info();
        cat.info();
    }

    public static void main(String[] args) {
        // Городской приют
        ShelterFactory cityShelter = new CityShelterFactory();
        ShelterAbstractFactoryDemo cityDemo = new ShelterAbstractFactoryDemo(cityShelter);
        cityDemo.showAnimals();

        // Сельский приют
        ShelterFactory villageShelter = new VillageShelterFactory();
        ShelterAbstractFactoryDemo villageDemo = new ShelterAbstractFactoryDemo(villageShelter);
        villageDemo.showAnimals();
    }
}