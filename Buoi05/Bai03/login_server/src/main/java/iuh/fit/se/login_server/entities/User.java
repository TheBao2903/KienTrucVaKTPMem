package iuh.fit.se.login_server.entities;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private String password;
}