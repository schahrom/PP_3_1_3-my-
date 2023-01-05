package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Transactional
    @Modifying
    @Query("update User u set u.username = ?1, u.password = ?2, u.email = ?3 " +
            "where u.username is not null and u.password is not null and u.email is not null")
    void updateUsernameAndPasswordAndEmailByUsernameNotNullAndPasswordNotNullAndEmailNotNull(@NonNull String username, @NonNull String password, String email);
    User findByUsername(String username);
}
