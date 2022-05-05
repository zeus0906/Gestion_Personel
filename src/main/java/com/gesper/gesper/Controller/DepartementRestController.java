package com.gesper.gesper.Controller;


import com.gesper.gesper.Dao.DepartementDao;
import com.gesper.gesper.Entite.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pers")
public class DepartementRestController {

    @Autowired
    DepartementDao departementDao;

    @GetMapping("/departements")
    public List<Departement> getAllDepartement(){
        List<Departement> departements = new ArrayList<>();
        departementDao.findAll().forEach(departements::add);
        return departements;
    }

    @GetMapping("/departements/{IdDep}")
    public Optional<Departement> getDepartementById(@PathVariable(value = "IdDep") long IdDep){
        return departementDao.findById(IdDep);
    }

    @PostMapping("/departements")
    public Departement addDepartement( @RequestBody Departement departement) {
        return departementDao.save(departement);
    }

    @DeleteMapping("/departements/{IdDep}")
    public void deleteDepartement(@PathVariable(value = "idArticle") Departement departement){
        departementDao.delete(departement);
    }

    @PutMapping("/departements/{IdDep}")
    public Departement updateDepartement( @RequestBody Departement departement ){
        return departementDao.save(departement);
    }
}
