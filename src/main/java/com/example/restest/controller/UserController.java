package com.example.restest.controller;
// Отвечает за логику запросов, связанными с пользователем

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Чтобы спринг понимал, что это контроллер
@RequestMapping("/users")  // Контроллер отправляет html файлы, но мы указываем рест контроллер
public class UserController {

    @GetMapping
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("Сервер работает");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
