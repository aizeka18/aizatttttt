package Abstact;

class CityShelterFactory implements ShelterFactory {
    @Override
    public ShelterDog createDog() {
        return new CityDog();
    }

    @Override
    public ShelterCat createCat() {
        return new CityCat();
    }
}