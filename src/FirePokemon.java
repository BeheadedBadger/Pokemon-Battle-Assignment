import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    static List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name,"Fire", level, hp, food, sound, attacks);
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Fire Lash");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Flamethrower");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Pyroball");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Inferno");
    }
}
