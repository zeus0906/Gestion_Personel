package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeDao extends JpaRepository<Grade, Long> {
}
