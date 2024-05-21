package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class todoListService {

    // TodoListRepositoryを注入する
    private final TodoListRepository todoListRepository;

    @Autowired
    public todoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public List<TodoList> getTodoListsByUserId(Long userId) {
        // 指定されたユーザーIDに関連するToDoリストを取得するロジックを実装
        return todoListRepository.findByUserId(userId);
    }

    // 他のビジネスロジックを追加する
}
