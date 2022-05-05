package com.gesper.gesper.Controller;


import com.gesper.gesper.Dao.CategorieDao;
import com.gesper.gesper.Entite.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CategorieRestController {

    @Autowired
    CategorieDao categorieDao;

    @GetMapping("/categories")
    public List<Categorie> getAllCategorie(){
        List<Categorie> categories = new ArrayList<>();
        categorieDao.findAll().forEach(categories::add);
        return categories;
    }

    @GetMapping("/categories/{IdCat}")
    public Optional<Categorie> getCategorieById(@PathVariable(value = "IdCat") long IdCat){
        return categorieDao.findById(IdCat);
    }

    @PostMapping("/categories")
    public Categorie addCategorie( @RequestBody Categorie categorie) {
        return categorieDao.save(categorie);
    }

    @DeleteMapping("/categories/{IdCat}")
    public void deleteCategorie(@PathVariable(value = "IdCat") Categorie categorie){
        categorieDao.delete(categorie);
    }

    @PutMapping("/categories/{IdCat}")
    public Categorie updateCategorie( @RequestBody Categorie categorie ){
        return categorieDao.save(categorie);
    }
}
