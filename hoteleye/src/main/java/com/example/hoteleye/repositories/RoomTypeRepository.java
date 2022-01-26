package com.example.hoteleye.repositories;

import com.example.hoteleye.models.RoomType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoomTypeRepository extends CrudRepository<RoomType, Long> {
    @Query(value = "select * from roomtypes", nativeQuery = true)
    List<RoomType> findAll();
}
