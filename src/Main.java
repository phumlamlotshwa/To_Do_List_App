import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Java To do List!");

        while (running) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. View tasks");
            System.out.println("2. Add a task");
            System.out.println("3. Mark task as done");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            String input = scanner.nextLine();


            switch (input) {
                case "1":
                    manager.listTasks();
                    break;
                case "2":
                    System.out.println("Enter task Description: ");  
                    String desc = scanner.nextLine();
                    System.out.println("Task added!");  
                    break;
                case "3":
                    manager.listTasks();
                    System.out.println("Enter task number to mark as done: "); 
                    int doneIndex = Integer.parseInt(scanner.nextLine()) -1;
                    manager.markTaskAsDone(doneIndex);  
                    System.out.println("Task marked as done.");
                    break;

                case "4":
                    manager.listTasks();
                    System.out.println("Enter task number to delete: ");  
                    int deleteIndex = Integer.parseInt(scanner.nextLine()) -1;
                    manager.deleteTask(deleteIndex);  
                    System.out.println("Task deleted.");
                    break;

                case "5":
                    running = false;
                    System.out.println("Goodbye!"); 
                    break;   
            
                default:
                    System.out.println("Invalid option. Try again.");
            }
            
        }
        scanner.close();
        
    }

    
}