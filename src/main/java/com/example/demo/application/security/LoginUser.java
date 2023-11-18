package com.example.demo.application.security;

import java.util.List;

public record LoginUser(Integer id, String name, String email, String password, List<String> roleList) {
}
