
public class Task {
    private String description;
    private boolean isDone;

    public Task(String description){
        this.description = description;
        this.isDone = false;

    }

    public String getDescription(){
        return description;
    }
    public boolean isDone(){
        return isDone();
    }

    public void markAsDone(){
        isDone = true;
    }

    @Override
    public String toString(){
        return (isDone ? "[✔️] " : "[ ]") + description;
    }

    public String toFileString(){
        return isDone + "," + description;
    }

    public static Task fromFileString(String line){
        String[] parts = line.split(";", 2);
        Task task = new Task(parts[1]); 
        if(Boolean.parseBoolean(parts[0])){
            task.markAsDone();;
        }
        return task;
    }



    
}
