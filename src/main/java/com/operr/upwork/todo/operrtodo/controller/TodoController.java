package com.operr.upwork.todo.operrtodo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.operr.upwork.todo.operrtodo.dto.request.TodoRequest;
import com.operr.upwork.todo.operrtodo.model.ApiResponse;
import com.operr.upwork.todo.operrtodo.model.Operrtodo;
import com.operr.upwork.todo.operrtodo.service.TodoService;

//This class is to write all necessary rest Api and interact with fornt end through end points
/*
* Created By : Anuj Katiyar 
* Upwork Profile : https://www.upwork.com/o/profiles/users/_~013ba77e1c6b6d3e9a/
*/

@RestController
@RequestMapping(value="/api/operr/todo")
@CrossOrigin
public class TodoController {

	@Autowired
	TodoService todoService;
	
	
	// Rest End Point for adding Event
	@RequestMapping(value="/addEvent",method=RequestMethod.POST)
	private ResponseEntity<?> addEvent(@Valid @RequestBody TodoRequest todoRequet){
		
		try{
	     			
			
			return new ResponseEntity<>(todoService.addEvent(todoRequet), HttpStatus.OK);			
			
		}catch( Exception ex){
		   return new ResponseEntity<>(new ApiResponse(false, "Please provide all necessary filed correct!"), HttpStatus.BAD_REQUEST);
		}
		
		
	} 
	
	@RequestMapping(value="/deleteEvent/{id}",method=RequestMethod.GET)
	private ResponseEntity<?> deleteEvent(@Valid @PathVariable int id){
		
		try{
	     			
			todoService.deleteEvent(id);
			return new ResponseEntity<>(new ApiResponse(true, "Todo Deleted Successfully"), HttpStatus.OK);			
			
		}catch( Exception ex){
		   return new ResponseEntity<>(new ApiResponse(false, "Deletation got failed ,  Please try again!"), HttpStatus.BAD_REQUEST);
		}
		
		
	} 
	
	
	@RequestMapping(value="/getEvent/{id}",method=RequestMethod.GET)
	private ResponseEntity<?> getEvent(@Valid @PathVariable int id){
		
		try{
	     			
			
			return new ResponseEntity<>(todoService.getEvent(id), HttpStatus.OK);			
			
		}catch( Exception ex){
		   return new ResponseEntity<>(new ApiResponse(false, "Event finding got failed ,  Please try again!"), HttpStatus.BAD_REQUEST);
		}
		
		
	} 
	
	
	
	@RequestMapping(value="/deleteMultipleEvent",method=RequestMethod.POST)
	private ResponseEntity<?> deleteMultipleEvent(@Valid @RequestBody List<Integer> ids){
		
		try{
	     			
			todoService.multipleDelete(ids);
			return new ResponseEntity<>(new ApiResponse(true, "Multiple Todo Deleted Successfully"), HttpStatus.OK);			
			
		}catch( Exception ex){
		   return new ResponseEntity<>(new ApiResponse(false, "Deletation got failed ,  Please try again!"), HttpStatus.BAD_REQUEST);
		}
		
		
	} 
	
	
	@RequestMapping(value="/getAllEvent",method=RequestMethod.GET)
	private ResponseEntity<?> getAllEvent(){
		
		try{
			
			return new ResponseEntity<>(todoService.getAllEvent(), HttpStatus.OK);			
			
		}catch( Exception ex){
		   return new ResponseEntity<>(new ApiResponse(false, "Please try again!"), HttpStatus.BAD_REQUEST);
		}
		
		
	} 
	
	
	
}
