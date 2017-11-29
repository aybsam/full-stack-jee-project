package com.gestion.commandes.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.commandes.dao.EvenementRepository;
import com.gestion.commandes.entities.Evenement;

@RestController
@RequestMapping(value = "/evenements")
public class EvenementRestController {

    @Autowired
    EvenementRepository evenementRepository;


    /*@RequestMapping(value = "/list-evenements", method = RequestMethod.GET)
    public List<Evenement> getAllEvenements(){
        return evenementRepository.findAll();
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Evenement> addEvenement(@RequestBody Evenement evenement){
        evenementRepository.save(evenement);
        return evenementRepository.findAll();
    }*/

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public List<Evenement> remove(@PathVariable Long id){
        evenementRepository.delete(id);
        return evenementRepository.findAll();
    }


}
