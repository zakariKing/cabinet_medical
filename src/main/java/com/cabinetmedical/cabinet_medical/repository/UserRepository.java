package com.cabinetmedical.cabinet_medical.repository;

import com.cabinetmedical.cabinet_medical.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
