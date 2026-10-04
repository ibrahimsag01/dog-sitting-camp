package dogcamp;

public class TransferCommand implements CampCommand {

    private final Dog targetDog;
    private final PlayArea destination;

    public TransferCommand(Dog targetDog, PlayArea destination) {
        this.targetDog = targetDog;
        this.destination = destination;
    }

    @Override
    public void execute() {
        // Implementation here
    }
}
