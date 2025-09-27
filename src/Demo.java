public class Demo {
    public static void main(String[] args) {
        Shelter shelter = new Shelter(2);

        Dog rex = new Dog("Rex");
        shelter.admit(rex);

        Cat whiskers = new Cat("Whiskers");


        CatAdapter adaptedCat = new CatAdapter(whiskers);
        shelter.admit(adaptedCat); // ✅ теперь кот принят через адаптер
    }
}
