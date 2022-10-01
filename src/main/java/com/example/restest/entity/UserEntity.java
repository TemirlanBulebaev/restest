package com.example.restest.entity;

import javax.persistence.*;
import java.util.List;

@Entity //Для создания таблицы из сущности
@Table(name = "user")
public class UserEntity {
    @Id // Спринг понимает, что это id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Для уникальности каждого id
    private Long id;
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<TodoEntity> todos;

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public List<TodoEntity> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoEntity> todos) {
        this.todos = todos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
