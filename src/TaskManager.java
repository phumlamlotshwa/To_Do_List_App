import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private static final String FILE_NAME = "tasks.txt";


    public TaskManager(){
        tasks = new ArrayList<>();
        loadTasks();

    }
    

}
