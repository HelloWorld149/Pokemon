import java.util.Scanner;

public class Main {

    private static final Object gateKeeper = new Object();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What pokemon do you want to search?");
        String pokemonName = scanner.nextLine();

        PokemonThread one = new PokemonThread("C:\\Users\\User\\IdeaProjects\\PokemonData\\src\\pokemon.txt", pokemonName);
        PokemonThread two = new PokemonThread("C:\\Users\\User\\IdeaProjects\\PokemonData\\src\\pokemon1.txt", pokemonName);

        one.a();
        two.a();

        try {
            one.join();
            two.join();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        scanner.close();
    }
}
