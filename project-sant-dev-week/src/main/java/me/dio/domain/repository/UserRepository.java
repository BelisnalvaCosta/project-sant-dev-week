package me.dio.domain.repository;

import me.dio.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    boolean existsByAccountNumber(String number);

    List<User> findAll();

    Optional<Object> findById(Long id);

    User save(User userToCreate);

    boolean existsByCardNumber(String number);

    void delete(User dbUser);
}
