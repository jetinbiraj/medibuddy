package com.medibuddy.controller;

import com.medibuddy.dto.ApiResponse;
import com.medibuddy.dto.ErrorResponse;
import com.medibuddy.dto.LoginRequest;
import com.medibuddy.dto.LoginResponse;
import com.medibuddy.service.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @PostMapping("/login")
    public ResponseEntity<Object> authenticateUser(@RequestBody LoginRequest loginRequest) {

        LoginResponse resp = homeService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword());

        if (!resp.isAuthenticated()) {
            return ResponseEntity.badRequest().body(new ErrorResponse(400, resp.getMessage()));
        }

        return ResponseEntity.ok(resp);
    }
}
