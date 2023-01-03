package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUser();

    void save(UserEntity userEntity);

    UserEntity show(Long id);

    void update(Long id, UserEntity userEntity);

    void delete(Long id);
}
