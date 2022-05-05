package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereDao extends JpaRepository<Filiere, Long> {
}
