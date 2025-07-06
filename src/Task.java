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



    
}
