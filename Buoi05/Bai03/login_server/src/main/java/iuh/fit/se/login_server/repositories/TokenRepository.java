package iuh.fit.se.login_server.repositories;

import iuh.fit.se.login_server.entities.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenRepository extends MongoRepository<Token, String> {
}