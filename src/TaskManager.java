import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    public void markTaskAsDone(int index){
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
            saveTasks();    
        }else{
            System.out.println("invalid task number.");
        }
    }
    
    public void deleteTask(int index){
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            saveTasks();
            
        }else{
            System.out.println("invalid task number");
        }
    }

    private void saveTasks(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Task task : tasks){
                writer.write(task.toFileString());
                writer.newLine();
            }
            
        }catch (IOException e){
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }



}
