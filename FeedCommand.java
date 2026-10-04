package dogcamp;

public class FeedCommand implements CampCommand {

    private final Dog targetDog;

    public FeedCommand(Dog targetDog) {
        this.targetDog = targetDog;
    }

    @Override
    public void execute() {
        // Implementation here
    }
}
