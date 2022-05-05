package com.gesper.gesper.Controller;

import com.gesper.gesper.Dao.FiliereDao;
import com.gesper.gesper.Entite.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class FiliereRestController {

    @Autowired
    FiliereDao filiereDao;

    @GetMapping("/filieres")
    public List<Filiere> getAllFiliere(){
        List<Filiere> filieres = new ArrayList<>();
        filiereDao.findAll().forEach(filieres::add);
        return filieres;
    }

    @GetMapping("/filieres/{IdFiliere}")
    public Optional<Filiere> getFiliereById(@PathVariable(value = "IdFiliere") long IdFiliere){
        return filiereDao.findById(IdFiliere);
    }

    @PostMapping("/filieres")
    public Filiere addFiliere(@RequestBody Filiere filieres){
        return filiereDao.save(filieres);
    }

    @DeleteMapping("/filieres/{IdFilieres}")
    public void deleteFiliere(@PathVariable(value = "IdFiliere") Filiere filiere){
         filiereDao.delete(filiere);
    }

    @PutMapping("/filieres")
    public Filiere updateFilere(@RequestBody Filiere filiere){
        return filiereDao.save(filiere);
    }
}
