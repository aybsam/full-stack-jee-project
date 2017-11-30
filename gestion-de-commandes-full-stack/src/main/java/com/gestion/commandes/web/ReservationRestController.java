package com.gestion.commandes.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.commandes.dao.ReservationRepository;
import com.gestion.commandes.entities.Evenement;
import com.gestion.commandes.entities.Reservation;

@RestController
//@RequestMapping(value="/salle/reservation/v1")
public class ReservationRestController {


    @Autowired
    ReservationRepository reservationRepository;

    @RequestMapping(value = "/list-reservations", method = RequestMethod.GET)
    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }
    
    @RequestMapping(value = "/evenements", method = RequestMethod.GET)
    public Page<Reservation> listEvenement(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size){
        return reservationRepository.findAll(new PageRequest(page, size));
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Reservation> addReservation(@RequestBody Reservation reservation){
        reservationRepository.save(reservation);
        return reservationRepository.findAll();
    }

    public List<Reservation> annulerReservation(){

        return reservationRepository.findAll();
    }



   /* @RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> getAvailableSalles(
            @RequestParam(value="checkin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkin,
            @RequestParam(value="checkout") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkout){
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @RequestMapping(value="", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> createReservation(
            @RequestBody ReservationRequest reservationRequest){

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
    }

    @RequestMapping(value="", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(@RequestBody ReservationRequest reservationRequest){

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @RequestMapping(value="/{reservationId}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> deleteReservation(@PathVariable long reservationId){

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }*/






}
