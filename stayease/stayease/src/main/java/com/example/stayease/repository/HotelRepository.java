package com.example.stayease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stayease.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
