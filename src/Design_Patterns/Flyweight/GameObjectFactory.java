package Design_Patterns.Flyweight;

import java.util.Map;
import java.util.HashMap;

public class GameObjectFactory {
    private final Map<String, GameObject> gameObjects = new HashMap<>();

    public GameObject getGameObject(String type) {
        return gameObjects.computeIfAbsent(type, Tree::new);
    }
}