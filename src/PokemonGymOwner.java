import java.util.ArrayList;
import java.util.List;

public class PokemonGymOwner {
    String name;
    String town;
    List<Pokemon> pokemon;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemon) {
        this.name = name;
        this.town = town;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
