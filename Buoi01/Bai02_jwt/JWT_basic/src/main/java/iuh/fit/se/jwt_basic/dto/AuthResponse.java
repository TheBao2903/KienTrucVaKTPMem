package iuh.fit.se.jwt_basic.dto;

public class AuthResponse {

    public String token;

    public AuthResponse(String token) {
        this.token = token;
    }
}