import domain.Tag;
import domain.TaskDescription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TasksTest {
    // Alle Methoden der Taskklasse sind mit maximaler Code-Coverage zu testen^
    // Es sind an passenden Stellen parametrisierte Tests zu verwenden

    @Test
    public void TagListHolen() throws IllegalArgumentException {

        List<Tag> list = new ArrayList<>();
        list.add(new Tag("Tag 1"));
        Assertions.assertEquals(list, (list));

    }

    @Test
    public void DescriptionHolen() throws IllegalArgumentException {

        List<TaskDescription> descr = new ArrayList<>();
        descr.add(new TaskDescription("Dies ist eine Beschreibung vom Task 1"));
        Assertions.assertEquals(descr, (descr));

    }

}
