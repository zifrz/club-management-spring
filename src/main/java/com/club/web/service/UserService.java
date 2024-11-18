package com.club.web.service;

import com.club.web.dto.RegistrationDto;
import com.club.web.models.UserEntity;
import jakarta.validation.constraints.NotEmpty;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(@NotEmpty String email);

    UserEntity findByUserName(@NotEmpty String username);
}
