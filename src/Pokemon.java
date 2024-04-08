import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pokemon {
    String name;
    String type;
    int level;
    int hp;
    String food;
    String sound;
    List<String> attacks = Arrays.asList();

    public Pokemon(String name, String type, int level, int hp, String food, String sound) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.attacks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
}
