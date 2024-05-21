package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//TodoListController.java

@RestController
@RequestMapping("/api/todolists")
public class TodoListController {
 
 @Autowired
 private TodoListRepository todoListRepository;
 
 @GetMapping("/{userId}")
 public ResponseEntity<?> getTodoListsByUserId(@PathVariable Long userId) {
     // 指定されたユーザーIDに関連するToDoリストを取得するロジックを実装
	 List<TodoList> todoLists = todoListService.getTodoListsByUserId(userId);
     
     if (todoLists.isEmpty()) {
         return ResponseEntity.notFound().build();
     }

     return ResponseEntity.ok(todoLists);
 }
 
 @PostMapping("/{userId}")
 public ResponseEntity<?> createTodoList(@PathVariable Long userId, @RequestBody TodoList todoList) {
     // ToDoリストの作成のロジックを実装
 }
 
 // 他のエンドポイントも同様に実装
}
