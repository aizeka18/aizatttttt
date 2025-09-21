package Factory;

class AnimalRegistrationFactory {
    public static ShelterAnimal registerAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new ShelterDog();
            case "cat":
                return new ShelterCat();
            case "rabbit":
                return new ShelterRabbit();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}