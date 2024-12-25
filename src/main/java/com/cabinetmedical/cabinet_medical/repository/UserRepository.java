package com.cabinetmedical.cabinet_medical.repository;

import com.cabinetmedical.cabinet_medical.model.Anas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Anas, Long> {
}
