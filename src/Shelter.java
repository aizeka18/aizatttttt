public class Shelter {
    private int capacity;
    private int count = 0;

    public Shelter(int capacity) {
        this.capacity = capacity;
    }


    public boolean admit(Animal animal) {
        if (count < capacity) {
            count++;
            System.out.println(animal.getName() + " was admitted. Says: " + animal.speak());
            return true;
        }
        System.out.println("Shelter is full. Cannot admit " + animal.getName());
        return false;
    }
}
