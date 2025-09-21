package Factory;

class ShelterDog implements ShelterAnimal {
    @Override
    public void info() {
        System.out.println("Dog: Friendly and loyal. Waiting for adoption.");
    }
}