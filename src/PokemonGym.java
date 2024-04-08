import java.util.List;

public interface PokemonGym {
    void enteredTheGym(PokemonTrainer trainer);
    void printPokemon(List<Pokemon> pokemon);
    void selectPokemon(Pokemon pokemon);
}
