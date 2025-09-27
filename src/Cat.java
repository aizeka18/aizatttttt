public class Cat {
    private final String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public String meow() {
        return "Meow!";
    }
}
