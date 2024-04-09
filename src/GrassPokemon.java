import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    static List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leafBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, "Grass", level, hp, food, sound, attacks);
    }

    void leafStorm(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Leaf storm");
    }
    void solarBeam(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Solar beam");
    }
    void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " uses Leech seed against " + enemy.getName());

        int baseDamage = 30;

        if (enemy.getType().equals("Fire") || enemy.getType().equals("Grass")) {
            System.out.println("It's not very effective..");
            baseDamage = baseDamage / 2;
        }
        if (enemy.getType().equals("Water")) {
            System.out.println(("It's super effective!"));
            baseDamage = baseDamage * 2;
        }

        enemy.hp = (enemy.hp - baseDamage);
        name.hp = (name.hp + baseDamage);
        if (enemy.hp > 0) {
            System.out.println(name.getName() + " drains " + baseDamage + " hp from " + enemy.getName());
        }
        if (enemy.hp <= 0) {
            System.out.println(enemy.getName() + " fainted and " + name.getName() + " gains " + baseDamage + " hp");
        }
    }

    void leafBlade(Pokemon name, Pokemon enemy) {
        Attacks.Attack(name, enemy, "Leaf blade");
    }
}
