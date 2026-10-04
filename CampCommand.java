package dogcamp;

/**
 * Open-Closed Principle: new staff actions are added by writing a new
 * class that implements this interface, never by modifying Camp.
 */
public interface CampCommand {
    void execute();
}
