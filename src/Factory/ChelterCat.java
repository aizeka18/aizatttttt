package Factory;

class ShelterCat implements ShelterAnimal {
    @Override
    public void info() {
        System.out.println("Cat: Independent but loving. Looking for a home.");
    }
}