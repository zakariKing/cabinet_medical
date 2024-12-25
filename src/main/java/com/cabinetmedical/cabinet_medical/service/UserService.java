package com.cabinetmedical.cabinet_medical.service;

import com.cabinetmedical.cabinet_medical.model.Anas;
import com.cabinetmedical.cabinet_medical.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Anas saveUser(Anas user) {
        return userRepository.save(user);
    }

    public List<Anas> getAllUsers() {
        return userRepository.findAll();
    }
}
