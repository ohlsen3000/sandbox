package com.example.restservice;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	@Autowired
    private ToDoRepository toDoRepository;

	public List<ToDo> getToDos(final Status status, final Instant createdAfter) {
		return toDoRepository.getToDos(status, createdAfter);
	}
}
