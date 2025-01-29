package com.example.stayease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stayease.entity.Booking;

public interface BookRepository extends JpaRepository<Booking, Long>{

}
