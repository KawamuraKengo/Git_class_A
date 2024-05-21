package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {
    TodoList findByUsername(String Task);
}
