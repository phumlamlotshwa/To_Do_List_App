import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private static final String FILE_NAME = "tasks.txt";


    public TaskManager(){
        tasks = new ArrayList<>();
        loadTasks();

    }
    public void addTask(String description){
        tasks.add(new Task(description));
        saveTasks();
    }

    public void listTasks(){
        if (tasks.isEmpty()) {
            System.out.println("no tasks found. ");
        
        }else{
            for (int i = 0; i < tasks.size(); i++){
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }



}
