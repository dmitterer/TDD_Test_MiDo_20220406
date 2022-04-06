import domain.TaskDescription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SaveLoadTasklistTests {
    // Alle Methoden der File-Management-Klasse mit maximaler Code-Coverage sind zu testen

    @Test
    public void DescriptionHolen() throws IllegalArgumentException {

        List<TaskDescription> descr = new ArrayList<>();
        descr.add(new TaskDescription("Dies ist eine Beschreibung vom Task 1"));
        Assertions.assertEquals(descr, (descr));

    }

}
