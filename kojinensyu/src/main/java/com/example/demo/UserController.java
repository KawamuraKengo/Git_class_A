package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//UserController.java

@RestController
@RequestMapping("/api/users")
public class UserController {
 
 @Autowired
 private UserRepository userRepository;
 
 @PostMapping("/register")
 public ResponseEntity<?> registerUser(@RequestBody User user) {
     // ユーザー登録のロジックを実装
 }
 
 @PostMapping("/login")
 public ResponseEntity<?> loginUser(@RequestBody UserLoginRequest loginRequest) {
     // ユーザーログインのロジックを実装
 }
 
 // 他のエンドポイントも同様に実装
}
