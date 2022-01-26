package com.example.hoteleye.services;

import com.example.hoteleye.models.Room;
import com.example.hoteleye.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService{
    @Autowired
    private RoomRepository repository;

    public List<Room> findAll(){
        return (List<Room>) repository.findAll();
    }

//    public void save(Room room);


}