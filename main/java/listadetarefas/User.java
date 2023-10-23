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

@Entity (name = "tb_user")
class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
	@Column 
    private String username;
	@Column 
    private String email;
    
    @OneToOne(cascade= CascadeType.ALL)
    private List<TaskList> taskLists;

    

    public User(int userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.taskLists = new ArrayList<>();
    }

    public void createTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public void deleteTaskList(TaskList taskList) {
        taskLists.remove(taskList);
    }

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}


}

