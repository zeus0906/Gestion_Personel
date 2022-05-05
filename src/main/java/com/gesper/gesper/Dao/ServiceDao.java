package com.gesper.gesper.Dao;

import com.gesper.gesper.Entite.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceDao extends JpaRepository<Service, Long> {
}
