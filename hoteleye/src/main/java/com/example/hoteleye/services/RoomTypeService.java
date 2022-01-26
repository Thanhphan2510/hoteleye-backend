package com.example.hoteleye.services;

import com.example.hoteleye.models.RoomType;
import com.example.hoteleye.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoomTypeService{
    @Autowired
    private RoomTypeRepository repository;
    public List<RoomType> findAll(){
        return (List<RoomType>) repository.findAll();
    }
}