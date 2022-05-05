package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionDao extends JpaRepository<Fonction, Long> {
}
