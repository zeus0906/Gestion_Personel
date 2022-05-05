package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie, Long> {
}
