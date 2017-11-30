package com.gestion.commandes.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.gestion.commandes.dao.SalleRepository;
import com.gestion.commandes.entities.Reservation;
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
    
    @RequestMapping(value = "/kolchi", method = RequestMethod.GET)
    public Page<Salle> listSalles(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size){
        return salleRepository.findAll(new PageRequest(page, size));
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
