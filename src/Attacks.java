import java.util.ArrayList;
import java.util.List;

public class Attacks {
    static void Attack(Pokemon name, Pokemon enemy, String attack)
    {
        System.out.println(name.getName() + " uses " + attack + " against " + enemy.getName());

        int baseDamage = 30;

        switch (name.getType().toLowerCase()) {
            case "fire" -> {
                if (enemy.getType().equalsIgnoreCase("Water") || enemy.getType().equalsIgnoreCase("Fire")) {
                    System.out.println("It's not very effective..");
                    baseDamage = baseDamage/2;
                }
                else if (enemy.getType().equalsIgnoreCase("Grass"))
                {
                    System.out.println("It's super effective!");
                    baseDamage = baseDamage*2;
                }
            }
            case "water" -> {
                if (enemy.getType().equalsIgnoreCase("Water")) {
                    System.out.println("It's not very effective..");
                    baseDamage = baseDamage/2;
                }
                else if (enemy.getType().equalsIgnoreCase("Fire"))
                {
                    System.out.println("It's super effective!");
                    baseDamage = baseDamage*2;
                }
            }
            case "electric" -> {
                if (enemy.getType().equalsIgnoreCase("Electric")) {
                    System.out.println("It's not very effective..");
                    baseDamage = baseDamage/2;
                }
                if (enemy.getType().equalsIgnoreCase("Water")) {
                    System.out.println(("It's super effective!"));
                    baseDamage = baseDamage*2;
                }
            }
            case "grass" -> {
                if (enemy.getType().equalsIgnoreCase("Fire") || enemy.getType().equalsIgnoreCase("Grass")) {
                    System.out.println("It's not very effective..");
                    baseDamage = baseDamage/2;
                }
                if (enemy.getType().equalsIgnoreCase("Water")) {
                    System.out.println(("It's super effective!"));
                    baseDamage = baseDamage * 2;
                }
            }
        }

        enemy.hp = (enemy.hp - baseDamage);

        if (enemy.hp > 0) {
            System.out.println(enemy.getName() + " loses " + baseDamage + " hp!");
        }
        if (enemy.hp <= 0) {
            System.out.println(enemy.getName() + " fainted!");
        }
    }
}
