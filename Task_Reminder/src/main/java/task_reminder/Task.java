package task_reminder;

public class Task {
	
	private String title;
    private String description;
    private String dueDate;
    private boolean completed;

	public Task(String title, String description, String dueDate) {
		super();
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.completed = false;
	}
	
	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}


	public String getDueDate() {
		return dueDate;
	}


	public boolean isCompleted() {
		return completed;
	}
	 public void markCompleted() {
	        completed = true;
	    }	

}

