package iuh.fit.se.login_server.controllers;

import iuh.fit.se.login_server.entities.User;
import iuh.fit.se.login_server.services.LoginService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public String login(@RequestBody User request) {
        return loginService.login(request.getUsername(), request.getPassword());
    }
}