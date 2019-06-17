package com.operr.upwork.todo.operrtodo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.operr.upwork.todo.operrtodo.dto.request.TodoRequest;
import com.operr.upwork.todo.operrtodo.model.Operrtodo;

//This class is to write all logic methods as service class 
/*
* Created By : Anuj Katiyar 
* Upwork Profile : https://www.upwork.com/o/profiles/users/_~013ba77e1c6b6d3e9a/
*/


@Service
public interface TodoService {

	int addEvent(@Valid TodoRequest todo);
	void deleteEvent(int id);
	void multipleDelete(List<Integer> ids);	
	List<Operrtodo> getAllEvent();
	Optional<Operrtodo> getEvent(@Valid int id);
	
}
