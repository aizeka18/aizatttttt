// CatAdapter.java — адаптер, чтобы Кот выглядел как Animal
public class CatAdapter implements Animal {
    private Cat cat;

    public CatAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String getName() {
        return cat.getNickname();
    }

    @Override
    public String speak() {
        return cat.meow();
    }
}
