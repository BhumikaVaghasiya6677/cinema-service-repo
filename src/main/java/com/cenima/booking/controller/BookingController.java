package com.cenima.booking.controller;

import com.cenima.booking.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/cinema")
public class BookingController {
    //We are not using database, so we use in memory data List.
        List<Ticket> ticketList=new ArrayList<>();
        //post method to insert tickets
        @PostMapping(path = "/tickets")
        public Ticket addTickets(@RequestBody Ticket ticket){
            ticketList.add(ticket);
            return  ticket;
        }
        //Get tickets List of tickets
        @GetMapping(path = "/tickets")
        public List<Ticket> getTickets(){
            return  ticketList;
        }

}
