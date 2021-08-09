package com.example.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@Autowired
    private ToDoService toDoService;

	@GetMapping("/todos")
	public List<ToDo> greeting(@RequestParam(value = "status", required = false) String status,
                         @RequestParam(value = "createdAfter", required = false) String createdAfter) {

	    // your code goes here
		return toDoService.getToDos(null, null);
	}
}
