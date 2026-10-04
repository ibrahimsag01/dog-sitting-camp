package dogcamp;

/**
 * Base class for every dog registered at the camp.
 * id is immutable once set; age is validated through encapsulation.
 */
public abstract class Dog {

    private final String id;      // globally unique, cannot change after registration
    private String name;
    private int age;
    private PlayArea currentArea; // 0..1 association: a dog is in at most one play area

    protected Dog(String id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be strictly positive");
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PlayArea getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(PlayArea currentArea) {
        this.currentArea = currentArea;
    }
}
