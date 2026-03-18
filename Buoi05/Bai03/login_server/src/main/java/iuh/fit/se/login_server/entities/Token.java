package iuh.fit.se.login_server.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tokens")
@Data
public class Token {
    @Id
    private String id;
    private String username;
    private String token;
}