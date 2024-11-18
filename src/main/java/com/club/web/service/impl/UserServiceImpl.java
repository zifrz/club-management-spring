package com.club.web.service.impl;

import com.club.web.dto.RegistrationDto;
import com.club.web.models.Role;
import com.club.web.models.UserEntity;
import com.club.web.repository.RoleRepository;
import com.club.web.repository.UserRepository;
import com.club.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(registrationDto.getUsername());
        userEntity.setEmail(registrationDto.getEmail());
        userEntity.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");

        userEntity.setRoles(Arrays.asList(role));
        userRepository.save(userEntity);

    }
}
