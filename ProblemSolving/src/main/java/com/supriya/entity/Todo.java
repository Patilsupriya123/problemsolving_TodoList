package com.supriya.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "todo")
    private String todo;

    @Column(name = "status")
    private String status;

    @Column(name = "priority")
    private String priority;
    
    // Getters and setters
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Todo(int id, String todo, String status, String priority) {
		super();
		this.id = id;
		this.todo = todo;
		this.status = status;
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", todo=" + todo + ", status=" + status + ", priority=" + priority + "]";
	}
	
}