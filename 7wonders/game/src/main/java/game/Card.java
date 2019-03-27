package game;

public class Card{

    private CardType type;
    private String name;
    private ManufacturedGood good;
    private Cost cost;
    private RawMaterials material;
    private RawMaterials ressources[];
    private RawMaterials[] ressourcesNecessaires;
    private int value;


    public Card(CardType type, String name, RawMaterials[] ressources, Cost cost){
        this.type = type;
        this.name = name;
        this.ressources = ressources;
        this.cost = cost;
    }

    public Card(CardType type, String name, RawMaterials[] ressourcesNecessaires, int value) {
        this.type = type;
        this.name = name;
        this.ressourcesNecessaires = ressourcesNecessaires;
        this.value = value;
    }

    public String getName() {
        return name;
    }


    public CardType getType(){return type;}

    public void setName(String name){
        this.name = name;
    }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }

    public Card(CardType type, String name) {
        this.type = type;
        this.name = name;
    }

    public Card(CardType type, String name, int value) {
        this(type, name);
        this.value = value;
    }

    public Card(CardType type, String name, RawMaterials material) {
        this(type, name);
        this.material = material;
    }

    public Card(CardType type, String name, ManufacturedGood good) {
        this(type, name);
        this.good = good;
    }

    public Card(CardType type, String name, RawMaterials material, Cost cost) {
        this(type, name, material);
        this.cost = cost;
    }

    public Card(CardType type, String name, int piece, RawMaterials ressourcesProduites[]){
        this(type, name);
        this.value = piece;
        this.ressources = ressourcesProduites;
    }

    public Card(CardType type, String name, int piece, RawMaterials ressourcesProduites[], Cost cost){
        this(type, name);
        this.value = piece;
        this.ressources = ressourcesProduites;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + ", type : " + type + ", valeur : " + value;
    }

    public boolean equals(Object o) {
        if ((o != null) && (o instanceof Card)) {
            return getName().equals(((Card) o).getName());
        }
        else return false;
    }
}