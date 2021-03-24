import java.io.FileNotFoundException;
import java.util.Scanner;

public class PokemonThread extends Thread{

    private static final Object gateKeeper = new Object();

    private final String fileName;
    private String pokemonName;


    public PokemonThread(String fileName, String pokemonName) {
        this.fileName = fileName;
        this.pokemonName = pokemonName;
    }

    public void run() {
        Pokemon pokemon;




        try {
            String[] pokemonInfo = Search.isPokemonExist(pokemonName, fileName);

            if (pokemonInfo == null) {
                System.out.println("Pokemon does not exist");
            }
            pokemon = new Pokemon(pokemonInfo);

            Search.writePokemon(pokemon);

        } catch (PokemonNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void a() {
        synchronized (gateKeeper) {
            this.start();
        }
    }


}
