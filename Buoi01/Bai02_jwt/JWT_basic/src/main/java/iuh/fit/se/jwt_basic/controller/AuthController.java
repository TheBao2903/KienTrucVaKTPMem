package iuh.fit.se.jwt_basic.controller;

import iuh.fit.se.jwt_basic.dto.AuthResponse;
import iuh.fit.se.jwt_basic.dto.LoginRequest;
import iuh.fit.se.jwt_basic.dto.RegisterRequest;
import iuh.fit.se.jwt_basic.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public void register(@RequestBody @Valid RegisterRequest request) {
        authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody @Valid LoginRequest request) {
        String token = authService.login(request);
        return new AuthResponse(token);
    }
}