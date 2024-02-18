package com.supriya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.supriya.entity.Todo;
import com.supriya.repo.TodoRepo;

@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoRepo todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(int id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found"));
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodoStatus(int id, String status) {
        Todo existingTodo = getTodoById(id);
        existingTodo.setStatus(status);
        return todoRepository.save(existingTodo);
    }

    public void deleteTodoById(int id) {
        todoRepository.deleteById(id);
    }
}