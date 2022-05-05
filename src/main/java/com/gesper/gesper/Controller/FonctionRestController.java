package com.gesper.gesper.Controller;

import com.gesper.gesper.Dao.FonctionDao;
import com.gesper.gesper.Entite.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("/pers")
@RestController
public class FonctionRestController {

    @Autowired
    FonctionDao fonctionDao;

    @GetMapping("/fonctions")
    public List<Fonction> getAllFonction(){
        List<Fonction> fonctions = new ArrayList<>();
        fonctionDao.findAll().forEach(fonctions :: add);
        return fonctions;
    }

    @GetMapping("/fonctions/{IdFonction}")
    public Optional<Fonction> getFonctionById(@PathVariable(value = "IdFonction") long IdFonction){
        return fonctionDao.findById(IdFonction);
    }

    @PostMapping("/fonctions")
    public Fonction addFonction(@RequestBody Fonction fonction){
        return fonctionDao.save(fonction);
    }

    @DeleteMapping("/fonctions/{IdFonction}")
    public void deleteFonction(@PathVariable(value = "IdFonction") long IdFonction){
        fonctionDao.deleteById(IdFonction);
    }

    @PutMapping("/fonctions")
    public Fonction updateFonction(@RequestBody Fonction fonction){
        return fonctionDao.save(fonction);
    }
}
