package com.example.hoteleye.repositories;

import com.example.hoteleye.models.Hotel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {
    @Query(value = "select * from hotels", nativeQuery = true)
    List<Hotel> findAll();
}
