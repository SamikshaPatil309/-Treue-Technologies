
package task_reminder;

import java.util.List;
import java.util.Scanner;

public class TaskReminderApp {
	 public static void main(String[] args) {
	        TaskManager taskManager = new TaskManager();
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        while (true) {
	            System.out.println("Task Reminder Application");
	            System.out.println("1. Add Task");
	            System.out.println("2. Mark Task as Completed");
	            System.out.println("3. View Tasks");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character
	            
	            switch (choice) {
          case 1:
              System.out.print("Enter task title: ");
              String title = scanner.nextLine();
              System.out.print("Enter task description: ");
              String description = scanner.nextLine();
              System.out.print("Enter due date (e.g., YYYY-MM-DD): ");
              String dueDate = scanner.nextLine();
              
              Task task = new Task(title,description,dueDate);
              taskManager.addTask(task);
              System.out.println("Task added successfully.");
              break;
          case 2:
              System.out.print("Enter the index of the task to mark as completed: ");
              int taskIndex = scanner.nextInt();
              taskManager.markTaskCompleted(taskIndex);
              System.out.println("Task marked as completed.");
              break;
              
          case 3:
              List<Task> tasks = taskManager.getTasks();
              System.out.println("Tasks:");
              for (int i = 0; i < tasks.size(); i++) {
                  Task t = tasks.get(i);
                  String status = t.isCompleted() ? "Completed" : "Pending";
                  System.out.println(i + ". " + t.getTitle() + " (" + status + ")");
                  System.out.println("   Due Date: " + t.getDueDate());
                  System.out.println("   Description: " + t.getDescription());
              }
              break;
          case 4:
              System.out.println("Exiting Task Reminder Application.");
              System.exit(0);
              break;
          default:
              System.out.println("Invalid choice. Please try again.");
      }
  }
	    }

}
