package Abstact;

class VillageShelterFactory implements ShelterFactory {
    @Override
    public ShelterDog createDog() {
        return new VillageDog();
    }

    @Override
    public ShelterCat createCat() {
        return new VillageCat();
    }
}