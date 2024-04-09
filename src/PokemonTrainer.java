import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> pokemon;

    public PokemonTrainer(String name, List<Pokemon> pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public String getName() {
        return name;
    }
}
