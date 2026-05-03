package com.example.login.controller;

import com.example.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        userService.register(username, password);
        return ResponseEntity.ok(Map.of("message", "Usuário registrado com sucesso"));
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        boolean authenticated = userService.authenticate(username, password);
        if (authenticated) {
            return ResponseEntity.ok(Map.of("message", "Login realizado com sucesso"));
        }
        return ResponseEntity.status(401).body(Map.of("error", "Credenciais inválidas"));
    }
}
