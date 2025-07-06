import java.nio.file.FileAlreadyExistsException;

public class Task {
    private String description;
    private String isDone;

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
        return (isDone ? "[✔️} " : "[ ]") + description;
    }

    public String toFileString(){
        return isDone + "," + description;
    }



    
}
