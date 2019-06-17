package com.operr.upwork.todo.operrtodo.dto.request;

import java.sql.Timestamp;

//This class is to request only fields we want to get from front end
/*
* Created By : Anuj Katiyar 
* Upwork Profile : https://www.upwork.com/o/profiles/users/_~013ba77e1c6b6d3e9a/
*/


public class TodoRequest {
	
	private int todoId;
	private String title;
	private String description;
	private Timestamp timeOfEvent;
	
	
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
	
	
}
