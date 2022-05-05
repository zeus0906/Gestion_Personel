package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeDao extends JpaRepository<Employe, Long> {
}

