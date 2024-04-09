import java.util.List;

public abstract class Pokemon {
    String name;
    String type;
    int level;
    int hp;
    String food;
    String sound;
    List<String> attacks;

    public Pokemon(String name, String type, int level, int hp, String food, String sound, List<String> attacks) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
