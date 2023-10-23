package listadetarefas;

import java.util.Date;

public class Main {
	    public static void main(String[] args) {
	        User user1 = new User(1, "john_doe", "john@example.com");
	        TaskList taskList1 = new TaskList(1, "Personal Tasks");
	        Task task1 = new Task(1, "Buy groceries", "Milk, eggs, bread", false, new Date(), new Date(), new Date(), user1);

	        user1.createTaskList(taskList1);
	        taskList1.addTask(task1);

	        System.out.println("User: " + user1.getUsername());
	        System.out.println("Task List: " + taskList1.getTitle());
	        System.out.println("Task: " + task1.getTitle());
	    }
	}


