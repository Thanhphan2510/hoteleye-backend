package com.example.hoteleye.services;

import com.example.hoteleye.models.Hotel;
import com.example.hoteleye.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService{
    @Autowired
    private HotelRepository repository;
    public List<Hotel> findAll(){
        return (List<Hotel>) repository.findAll();
    }
}
