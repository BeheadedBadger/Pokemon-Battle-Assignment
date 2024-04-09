import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    static List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, "water", level, hp, food, sound, attacks);
    }

    void surf(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Surf");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Hydro pump");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Hydro canon");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        int baseDamage = 30;
        if (enemy.getType().equals("Electric")) {
            System.out.println("Rain dance has no effect on " + enemy.getName());
        }
        if (enemy.getType().equals("Grass")) {
            enemy.hp = (enemy.hp + baseDamage);
            System.out.println("Rain dance restored enemy " + enemy.getName() + " by " + baseDamage + " hp");
        }
        else {
            Attacks.Attack(name, enemy, "Rain dance");
        }
    }

}
