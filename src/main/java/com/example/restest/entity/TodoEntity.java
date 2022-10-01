package com.example.restest.entity;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class TodoEntity {
    @Id // Спринг понимает, что это id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Для уникальности каждого id
    private Long id;
    private String title;
    private Boolean completed;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id") //Указываем поле по которому эти таблицы будут связываться
    private UserEntity user; //Называние поля которое мы укавзали в mappedBy для связки сущности

    public TodoEntity() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}

