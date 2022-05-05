package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementDao extends JpaRepository< Departement, Long> {
}
