package com.gestion.commandes.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.gestion.commandes.dao.SalleRepository;
import com.gestion.commandes.entities.Salle;

@RestController
@RequestMapping(value="/salles")
public class SalleRestController {

    @Autowired
    SalleRepository salleRepository;

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Salle> addSalle(@RequestBody Salle salle) {
        salleRepository.save(salle);
        return salleRepository.findAll();
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public List<Salle> remove(@PathVariable String id){
        salleRepository.delete(id);
        return salleRepository.findAll();
    }
}
