import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    static List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "voltTackle", "thunder");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, "Electric", level, hp, food, sound, attacks);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Thunder punch");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Electro ball");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Volt tackle");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        int baseDamage = 30;

        if (enemy.getType().equals("Electric")) {
            System.out.println("Rain dance restored enemy " + enemy.getName() + " by " + baseDamage + " hp");
        }
        else {
            Attacks.Attack(name, enemy, "Thunder");
        }
    }
}
