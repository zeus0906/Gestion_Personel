package com.gesper.gesper.Controller;

import com.gesper.gesper.Dao.ServiceDao;
import com.gesper.gesper.Entite.Grade;
import com.gesper.gesper.Entite.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ServiceRestController {

    @Autowired
    ServiceDao serviceDao;


    @GetMapping("/services")
    public List<Service> getAllService(){
        List<Service> services = new ArrayList<>();
        serviceDao.findAll().forEach(services :: add);
        return services;
    }

    @GetMapping("/services/{IdSer}")
    public Optional<Service> getServiceById(@PathVariable(value = "IdSer") long IdSer){
        return serviceDao.findById(IdSer);
    }

    @PostMapping("/services")
    public Service addService(@RequestBody Service service){
        return serviceDao.save(service);
    }

    @DeleteMapping("/services/{IdSer}")
    public void deleteService(@PathVariable(value = "IdSer") Service service){
        serviceDao.delete(service);
    }

    @PutMapping("/services")
    public Service updateService(@RequestBody Service service){
        return serviceDao.save(service);
    }
}
