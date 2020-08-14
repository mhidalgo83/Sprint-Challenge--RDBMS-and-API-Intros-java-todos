package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todoService")
public class TodoServiceImpl implements TodosService {

    @Autowired
    TodoRespository todorepos;


    @Override
    public void markComplete(long todoid) {

    }
}
