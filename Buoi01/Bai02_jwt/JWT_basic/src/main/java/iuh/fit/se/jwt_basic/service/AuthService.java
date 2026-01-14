package iuh.fit.se.jwt_basic.service;

import iuh.fit.se.jwt_basic.dto.LoginRequest;
import iuh.fit.se.jwt_basic.dto.RegisterRequest;
import iuh.fit.se.jwt_basic.entity.User;
import iuh.fit.se.jwt_basic.repository.UserRepository;
import iuh.fit.se.jwt_basic.security.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // REGISTER
    public void register(RegisterRequest request) {
        if (userRepository.existsByUsername(request.username)) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(request.username);
        user.setPassword(passwordEncoder.encode(request.password));
        user.setRole("USER");

        userRepository.save(user);
    }

    // LOGIN
    public String login(LoginRequest request) {
        User user = userRepository.findByUsername(request.username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(request.password, user.getPassword())) {
            throw new RuntimeException("Wrong password");
        }

        return JwtUtil.generateToken(String.valueOf(user));
    }
}