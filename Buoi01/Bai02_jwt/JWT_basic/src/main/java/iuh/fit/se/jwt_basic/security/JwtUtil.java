package iuh.fit.se.jwt_basic.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import iuh.fit.se.jwt_basic.entity.User;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // 🔐 Secret phải >= 32 bytes
    private static final String SECRET =
            "jwt-secret-key-jwt-secret-key-jwt-secret-key";

    private static final long EXPIRATION_TIME =
            1000 * 60 * 60; // 1 giờ

    private static final Key KEY =
            Keys.hmacShaKeyFor(SECRET.getBytes());

    // 👉 Tạo token khi login
    public static String generateToken(User user) {
        return Jwts.builder()
                .setSubject(user.getUsername())
                .claim("role", user.getRole())
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis() + EXPIRATION_TIME)
                )
                .signWith(KEY, SignatureAlgorithm.HS256)
                .compact();
    }

    // 👉 Verify token (dùng trong Filter)
    public static Claims parseToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}