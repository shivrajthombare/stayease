package com.example.stayease.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.stayease.entity.Hotel;
import com.example.stayease.repository.HotelRepository;

@RestController
public class HotelController {

	HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@PostMapping("/hotels")
	public ResponseEntity<?> createHotel(@RequestBody Hotel hotel) {
		hotelRepository.save(hotel);
		return ResponseEntity.ok("Hotel added successfully!");
	}
}
