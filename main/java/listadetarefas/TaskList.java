package listadetarefas;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity (name = "tb_taskList")
class TaskList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskListId;
	@Column 
    private String title;
	@OneToOne(cascade= CascadeType.ALL)
    private List<Task> tasks;

 

    public TaskList(int taskListId, String title) {
        this.taskListId = taskListId;
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
