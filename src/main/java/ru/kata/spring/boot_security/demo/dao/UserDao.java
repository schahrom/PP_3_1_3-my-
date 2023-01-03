package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.UserEntity;

import java.util.List;

public interface UserDao {

    List<UserEntity> getAllUser();

    void save(UserEntity userEntity);

    UserEntity show(Long id);

    void update(Long id, UserEntity userEntity);

    void delete(Long id);
}
