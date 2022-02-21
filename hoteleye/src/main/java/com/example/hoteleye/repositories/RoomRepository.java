package com.example.hoteleye.repositories;

import com.example.hoteleye.models.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

//@Transactional(rollbackFor = Exception.class)
public interface RoomRepository extends Repository<Room, Long> {
    @Query(value = "SELECT * from rooms inner join hotels inner join roomtypes", nativeQuery = true)
    List<Room> findAll();

    void save(Room room);

}