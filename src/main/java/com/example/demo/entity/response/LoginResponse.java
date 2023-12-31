package com.example.demo.entity.response;

import java.time.LocalDateTime;

public class LoginResponse {
    private int id;
    private LocalDateTime last_accessed;
    private String token;//token令牌
    public void setLast_accessed(LocalDateTime last_accessed) {
        this.last_accessed = last_accessed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLast_accessed() {
        return last_accessed;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
