package com.sourceinformation.scaffold.repository;

import com.sourceinformation.scaffold.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String login);
}
