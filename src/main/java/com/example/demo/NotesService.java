package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class NotesService {
	@Autowired
	private NotesRepository notesRepository;
	
	// Retrieve all rows from table and populate list with objects
		public List getAllReservations() {
			
			List reservations = new ArrayList<>();
			notesRepository.findAll().forEach(reservations::add);
			
			return reservations;
		}
		
		// Retrieves one row from table based on given id
		public Notes getReservation(String id) {
			return notesRepository.findById(id).orElse(null);
		
		}
		
		// Inserts row into table 
		public void addReservation(Notes notes) {
			notesRepository.save(notes);
		}
		
		// Updates row in table
		public void updateReservation(Long id, Notes notes) {
			notesRepository.save(notes);
		}
		
		// Removes row from table
		public void deleteReservation(String id) {
			notesRepository.deleteById(id);;
		}
	
	
}
