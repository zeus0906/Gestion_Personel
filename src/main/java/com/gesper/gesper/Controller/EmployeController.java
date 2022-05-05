package com.gesper.gesper.Controller;

import com.gesper.gesper.Dao.EmployeDao;
import com.gesper.gesper.Dao.FonctionDao;
import com.gesper.gesper.Entite.Employe;
import com.gesper.gesper.Entite.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeController {

    @Autowired
    EmployeDao employeDao;

    @GetMapping("/employes")
    public List<Employe> getAllEmploye(){
        List<Employe> employe = new ArrayList<>();
        employeDao.findAll().forEach(employe :: add);
        return employe;
    }

    @GetMapping("/employes/{IdEmploye}")
    public Optional<Employe> getEmployeById(@PathVariable(value = "IdEmploye") long IdEmploye){
        return employeDao.findById(IdEmploye);
    }

    @PostMapping("/employes")
    public Employe addEmploye(@RequestBody Employe employe){
        return employeDao.save(employe);
    }

    @DeleteMapping("/employes/{IdEmploye}")
    public void deleteEmploye(@PathVariable(value = "IdEmploye") long IdEmploye){
        employeDao.deleteById(IdEmploye);
    }

    @PutMapping("/employes")
    public Employe updateEmploye(@RequestBody Employe employe){
        return employeDao.save(employe);
    }
}

