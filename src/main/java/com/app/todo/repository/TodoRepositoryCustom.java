package com.app.todo.repository;

import com.app.todo.dto.TodoDto;
import com.app.todo.entity.Todo;

import org.springframework.data.domain.Page;

public interface TodoRepositoryCustom {
    Page<Todo> findByTodoLike(TodoDto.Search searchDto);
}
