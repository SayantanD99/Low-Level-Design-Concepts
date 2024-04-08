package Design_Patterns.Flyweight;

public class Tree implements GameObject {
    private final String type;

    public Tree(String type) {
        this.type = type;
    }

    @Override
    public void render(String player) {
        System.out.println("Rendering a " + type + " for player " + player);
    }
}