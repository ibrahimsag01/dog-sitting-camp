package dogcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Owned (by composition) by exactly one Camp.
 * Holds zero or more dogs at a time (aggregation: PlayArea does not own
 * the dogs' lifecycle, it only tracks who is currently assigned here).
 */
public class PlayArea {

    private final String name;
    private final int capacity;
    private final List<Dog> dogs = new ArrayList<>();

    public PlayArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void addDog(Dog dog) {
        // Implementation here
    }

    public void removeDog(Dog dog) {
        // Implementation here
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
