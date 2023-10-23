package listadetarefas;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "tb_task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskId;
	
	@Column 
	private String title;
	@Column 
	private String description;
	@Column 
	private boolean completed;
	@Column 
	private Date dueDate;
	@Column 
	private Date createdAt;
	@Column 
	private Date updatedAt;
	@Column 
	private User user;
	

public Task(int taskId, String title, String description, boolean completed, Date dueDate, Date createdAt, Date updatedAt, User user) {
    this.taskId = taskId;
    this.title = title;
    this.description = description;
    this.completed = completed;
    this.dueDate = dueDate;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.user = user;
}

public String getTitle() {
	// TODO Auto-generated method stub
	return null;
}

}