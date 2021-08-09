package com.example.restservice;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ToDoRepository {

    private static final ZoneId UTC = ZoneId.of("UTC");

    static final List<ToDo> TODOS = new ArrayList<>();

    static {
        TODOS.add(new ToDo(1, "Go shopping", Status.DONE, LocalDate.now(UTC).minusDays(2).atStartOfDay(UTC).toInstant()));
        TODOS.add(new ToDo(2, "Wash Car", Status.OPEN, LocalDate.now(UTC).minusDays(1).atStartOfDay(UTC).toInstant()));
        TODOS.add(new ToDo(3, "Learn Groovy", Status.OPEN, LocalDate.now(UTC).minusDays(0).atStartOfDay(UTC).toInstant()));
    }

    public List<ToDo> getToDos(final Status status, final Instant createdAfter) {
        List<ToDo> filtered = new ArrayList<>(TODOS);
        if (status != null) {
            // TODO: your code goes here
        }
        if (createdAfter != null) {
            // TODO: your code goes here
        }
        return filtered;
    }


}
