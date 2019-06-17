package com.operr.upwork.todo.operrtodo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;


//This is database table model class 
/*
* Created By : Anuj Katiyar 
* Upwork Profile : https://www.upwork.com/o/profiles/users/_~013ba77e1c6b6d3e9a/
*/


@Entity
@Table(name="operrtodo")
@Where(clause="deleted = false")
@NamedQuery(name="Operrtodo.findAll", query="SELECT r FROM Operrtodo r")
public class Operrtodo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="todo_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int todoId;
	
	// Title can not be null as per requirements
	@Column(name="title")
	@NotNull
	private String title;
	
	// Description can not be null as per requirements
	@Column(name="description")
	@NotNull
	private String description;	

	// Event Time can not be null as per requirements
	@Column(name="time_of_event")
	@NotNull
	private Timestamp timeOfEvent;

	//For maintaining soft-delete
	@Column(name="deleted")
    private boolean deleted;
	
	// Event Creation Date
	@Column(name="created_date")
	private Date createdDate;
	
	
	private transient boolean checked;

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTimeOfEvent() {
		return timeOfEvent;
	}

	public void setTimeOfEvent(Timestamp timeOfEvent) {
		this.timeOfEvent = timeOfEvent;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Operrtodo() {
		
	}
	
	
	public Operrtodo( int todoId, @NotNull String title, @NotNull String description, @NotNull Timestamp timeOfEvent
			) {
		super();		
		this.todoId= todoId;
		this.title = title;
		this.description = description;
		this.timeOfEvent = timeOfEvent;
		this.createdDate = new Date();
	}

	@Override
	public String toString() {
		return "Operrtodo [todoId=" + todoId + ", title=" + title + ", description=" + description + ", timeOfEvent="
				+ timeOfEvent + ", deleted=" + deleted + ", createdDate=" + createdDate + "]";
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	
	
	
	
	
	
	
	
	
}

