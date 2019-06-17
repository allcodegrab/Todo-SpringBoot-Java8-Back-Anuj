package com.operr.upwork.todo.operrtodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operr.upwork.todo.operrtodo.model.Operrtodo;

//This interface is to make interaction with database layer
/*
* Created By : Anuj Katiyar 
* Upwork Profile : https://www.upwork.com/o/profiles/users/_~013ba77e1c6b6d3e9a/
*/


@Repository
public interface TodoRepository extends JpaRepository<Operrtodo, Integer> {


}
