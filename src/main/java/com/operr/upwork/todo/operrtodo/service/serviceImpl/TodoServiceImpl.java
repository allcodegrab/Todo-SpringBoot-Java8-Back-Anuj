package com.operr.upwork.todo.operrtodo.service.serviceImpl;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operr.upwork.todo.operrtodo.dto.request.TodoRequest;
import com.operr.upwork.todo.operrtodo.model.Operrtodo;
import com.operr.upwork.todo.operrtodo.repository.TodoRepository;
import com.operr.upwork.todo.operrtodo.service.TodoService;


//This class is implements all TodoService Method
/*
* Created By : Anuj Katiyar 
* Upwork Profile : https://www.upwork.com/o/profiles/users/_~013ba77e1c6b6d3e9a/
*/


@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	TodoRepository todoRepository;
	
	
	// Add a todo 
	@Override
	public int addEvent(@Valid TodoRequest todo) {
		
		
		Operrtodo operrtodo = new Operrtodo(todo.getTodoId(),todo.getTitle(), todo.getDescription(), todo.getTimeOfEvent());
		todoRepository.save(operrtodo);
		return operrtodo.getTodoId();
		
		
	}

	// delete a todo
	@Override
	public void deleteEvent(int id) {
		
		 todoRepository.deleteById(id);
	}

	
	// delete multiple todo as per requirements 
	@Override
	public void multipleDelete(List<Integer> ids) {
		
		for (int  id: ids) {
			 todoRepository.deleteById(id);
		}
		
	}

	
	// Get List Of All Todo
	@Override
	public List<Operrtodo> getAllEvent() {

		try {
		return todoRepository.findAll();
		}catch(Exception ex)
		{
			System.out.println(ex);
			return null;
		}
	}

	@Override
	public Optional<Operrtodo> getEvent(@Valid int id) {
			return todoRepository.findById(id);
	}

}
