package ru.vedeshkin.hw8.service;

import ru.vedeshkin.hw8.dto.UserDto;
import ru.vedeshkin.hw8.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
