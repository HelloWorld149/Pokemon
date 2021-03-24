import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 *
 * Author: Yunhu Kim
 * Version March 19th, 2021
 *
 */


public class Search {

    /**
     * isPokemonExist checks whether pokemon exist or not by searching the name.
     *
     * @param pokemonName  name of pokemon
     * @return boolean value that checks whether pokemon exist
     */

    public static String[] isPokemonExist(String pokemonName , String fileName) throws PokemonNotFoundException{

        //[#,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary]
        String[] pokemonInformation;

        File f = new File(fileName);

        try(BufferedReader bfr = new BufferedReader(new FileReader(f))) {
            String line = bfr.readLine();

            while (line != null) {



                pokemonInformation = line.split(",");
                System.out.println(Arrays.toString(pokemonInformation));

                if (pokemonInformation[1].equals(pokemonName)) {
                    System.out.println("Pokemon is loaded");
                    return pokemonInformation;
                }

                line = bfr.readLine();
            }

            } catch(IOException e){
                e.printStackTrace();
            }

        return null;
    }
  //HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary


    public static String writePokemon(Pokemon pokemon) throws PokemonNotFoundException {

        File f = new File("Pokemon_Result.txt");

        try(PrintWriter pw = new PrintWriter(new FileOutputStream(f))) {

            pw.println(pokemon.toString());
            return "Pokemon is written";

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return "Pokemon is not found";
    }




}
