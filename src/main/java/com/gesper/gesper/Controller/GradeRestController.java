package com.gesper.gesper.Controller;

import com.gesper.gesper.Dao.GradeDao;
import com.gesper.gesper.Entite.Filiere;
import com.gesper.gesper.Entite.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class GradeRestController {

    @Autowired
    GradeDao gradeDao;

    @GetMapping("/grades")
    public List<Grade> getAllGrade(){
        List<Grade> grades = new ArrayList<>();
        gradeDao.findAll().forEach(grades :: add);
        return grades;
    }

    @GetMapping("/grades/{Idgrade}")
    public Optional<Grade> getGradeById(@PathVariable(value = "Idgrade") long Idgrade){
        return gradeDao.findById(Idgrade);
    }

    @PostMapping("/grades")
    public Grade addGrade(@RequestBody Grade grade){
        return gradeDao.save(grade);
    }

    @DeleteMapping("/grades/{Idgrade}")
    public void deleteGrade(@PathVariable(value = "Idgrade") Grade grade){
        gradeDao.delete(grade);
    }

    @PutMapping("/grades")
    public Grade updateGrade(@RequestBody Grade grade){
        return gradeDao.save(grade);
    }
}
