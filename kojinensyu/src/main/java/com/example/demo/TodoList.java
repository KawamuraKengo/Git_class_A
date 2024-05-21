package com.example.demo;

import java.util.List;

import org.springframework.scheduling.config.Task;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo_lists")
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "todoList", cascade = CascadeType.ALL)
    private List<Task> tasks;

    // コンストラクタ、ゲッター、セッターなど

    public TodoList() {
    }

    public TodoList(String title, List<Task> tasks) {
        this.title = title;
        this.tasks = tasks;
    }

    // 他のメソッドもここに追加する

}
