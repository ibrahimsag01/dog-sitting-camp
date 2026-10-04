package dogcamp;

import java.util.Arrays;
import java.util.List;

/**
 * Composes exactly 3 play areas: if the camp is destroyed, its play
 * areas go with it. Acts as the Invoker in the Command pattern: it
 * knows how to run a CampCommand, but not what any command does.
 */
public class Camp {

    private final String name;
    private final PlayArea[] playAreas; // composition, fixed size 3

    public Camp(String name, PlayArea[] playAreas) {
        if (playAreas == null || playAreas.length != 3) {
            throw new IllegalArgumentException("A camp must have exactly 3 play areas");
        }
        this.name = name;
        this.playAreas = playAreas;
    }

    public void executeCommand(CampCommand cmd) {
        cmd.execute();
    }

    public List<PlayArea> getPlayAreas() {
        return Arrays.asList(playAreas);
    }

    public String getName() {
        return name;
    }
}
