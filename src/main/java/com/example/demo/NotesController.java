package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1")
public class NotesController {
	
	@Autowired
	private NotesService notesService;
	
	// ------------ Retrieve all reservations ------------
	@RequestMapping(value = "/notes", method = RequestMethod.GET)
	public List getAllReservations() {
		
		return notesService.getAllReservations();
		
	}
	
	// ------------ Retrieve a reservation ------------
	@RequestMapping(value = "/notes/{id}", method = RequestMethod.GET)
	public Notes getReservation(@PathVariable String id) {
		return notesService.getReservation(id);
	}
	
	// ------------ Create a reservation ------------
	@RequestMapping(value = "/notes", method = RequestMethod.POST)
	public void addReservation(@RequestBody Notes notes) {
		notesService.addReservation(notes);
		
	}
	
	// ------------ Update a reservation ------------
	@RequestMapping(value = "/notes/{id}", method = RequestMethod.PUT)
	public void updateReservation(@RequestBody Notes notes,@PathVariable Long id) {
		notesService.updateReservation(id, notes);
	}
	
	// ------------ Delete a reservation ------------
	@RequestMapping(value = "/notes/{id}", method = RequestMethod.DELETE)
	public void deleteReservation(@PathVariable String id) {
		notesService.deleteReservation(id);
	}

}
