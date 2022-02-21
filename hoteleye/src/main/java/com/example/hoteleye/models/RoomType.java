package com.example.hoteleye.models;

import javax.persistence.*;

@Entity
@Table(name = "roomtypes")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int capacity;

    @Column(name = "openprice", nullable = false)
    private float openPrice;

    @Column(name = "hourprice", nullable = false)
    private float hourPrice;

    @Column(name = "nightprice", nullable = false)
    private float nightPrice;

    @Column(name = "description", nullable = false)
    private String description;

    public RoomType(int id, String name, int capacity, float openPrice, float hourPrice, float nightPrice, String description) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.openPrice = openPrice;
        this.hourPrice = hourPrice;
        this.nightPrice = nightPrice;
        this.description = description;
    }

    public RoomType() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(float openPrice) {
        this.openPrice = openPrice;
    }

    public float getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(float hourPrice) {
        this.hourPrice = hourPrice;
    }

    public float getNightPrice() {
        return nightPrice;
    }

    public void setNightPrice(float nightPrice) {
        this.nightPrice = nightPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
