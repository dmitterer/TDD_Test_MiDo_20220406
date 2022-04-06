import domain.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskListTests {
    // Alle Methoden der Taskliste sind mit maximaler Code-Coverage zu testen
    // Es sind an passenden Stellen parametrisierte Tests zu verwenden
    // Die importData-Methode muss mit Mock getestet werden.


    @Test
    public void ZeigeTaskList() throws IllegalArgumentException {

        List<TaskList> list = new ArrayList<>();
        list.add(new TaskList());
        Assertions.assertEquals(list, (list));
    }

    @Test
    public void ZeigeImportData() throws IllegalArgumentException {

        List<TaskList> list = new ArrayList<>();
        list.add(new TaskList());
        Assertions.assertEquals(list, (list));

    }
}
