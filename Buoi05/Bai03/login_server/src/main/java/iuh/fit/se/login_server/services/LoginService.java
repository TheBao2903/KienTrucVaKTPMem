package iuh.fit.se.login_server.services;

import iuh.fit.se.login_server.entities.Token;
import iuh.fit.se.login_server.repositories.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final RestTemplate restTemplate;
    private final TokenRepository tokenRepository;

    private final String REGISTER_SERVICE_URL = "http://localhost:8080/api/auth/user/";

    public String login(String username, String password) {
        // gọi sang register service
        User user = restTemplate.getForObject(
                REGISTER_SERVICE_URL + username, User.class);

        if (user == null || !user.getPassword().equals(password)) {
            throw new RuntimeException("Sai tài khoản hoặc mật khẩu");
        }

        // tạo token (demo)
        String tokenStr = UUID.randomUUID().toString();

        Token token = new Token();
        token.setUsername(username);
        token.setToken(tokenStr);

        tokenRepository.save(token);

        return tokenStr;
    }
}