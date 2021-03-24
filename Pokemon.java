public class Pokemon {

    private final String number;
    private final String name;
    private final String type1;
    private final String type2;
    private final String total;
    private final String hp;
    private final String attack;
    private final String defense;
    private final String spAtt;
    private final String spDef;
    private final String speed;
    private final String generation;
    private final String legendary;

    public Pokemon(String[] pokemonInfo) {
        this.number = pokemonInfo[0];
        this.name = pokemonInfo[1];
        this.type1 = pokemonInfo[2];
        this.type2 = pokemonInfo[3];
        this.total = pokemonInfo[4];
        this.hp = pokemonInfo[5];
        this.attack = pokemonInfo[6];
        this.defense = pokemonInfo[7];
        this.spAtt = pokemonInfo[8];
        this.spDef = pokemonInfo[9];
        this.speed = pokemonInfo[10];
        this.generation = pokemonInfo[11];
        this.legendary = pokemonInfo[12];
    }



    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getAttack() {
        return attack;
    }

    public String getDefense() {
        return defense;
    }

    public String getHp() {
        return hp;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getTotal() {
        return total;
    }

    public String getSpAtt() {
        return spAtt;
    }

    public String getSpDef() {
        return spDef;
    }

    public String getSpeed() {
        return speed;
    }

    public String getGeneration() {
        return generation;
    }

    public String getLegendary() {
        return legendary;
    }

    public String toString() {
        return "Pokemon{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", total='" + total + '\'' +
                ", hp='" + hp + '\'' +
                ", attack='" + attack + '\'' +
                ", defense='" + defense + '\'' +
                ", spAtt='" + spAtt + '\'' +
                ", spDef='" + spDef + '\'' +
                ", speed='" + speed + '\'' +
                ", generation='" + generation + '\'' +
                ", legendary='" + legendary + '\'' +
                '}';
    }
}
