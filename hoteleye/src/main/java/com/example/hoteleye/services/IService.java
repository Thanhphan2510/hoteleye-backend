package com.example.hoteleye.services;

import java.util.List;
//import com.example.hoteleye.entities;

public interface IService {


    List<Object> list();

    Object get(Object index);

    Object saveOrUpdate(Object users);

    void delete(Object users);
}
