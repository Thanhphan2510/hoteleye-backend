package com.example.hoteleye.models;


import javax.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "room_number", nullable = false)
    private int room_number;

    @ManyToOne(targetEntity = RoomType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_type_id", referencedColumnName = "id")
    private RoomType roomType;

    @ManyToOne(targetEntity = Hotel.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private Hotel hotel;

    @Column(name = "floor_number", nullable = false)
    private int floor_number;

    @Column(name = "description", nullable = false)
    private  String description; //vd: đối diện mặt đường,...

    @Column(name = "status", nullable = false)
    private int status; // -3: phòng không còn sử dụng, -2: phòng có khách, -1: phòng có người đặt, 0: phòng chưa dọn, 1: phòng đã dọn (phòng trống)

    @Column(name = "note", nullable = false)
    private String note; //vd: có vấn đề như thiếu chăn lúc khách ra

    public Room() {
    }

    public Room(long id, int room_number, RoomType roomType, Hotel hotel, int floor_number, String description, int status, String note) {
        this.id = id;
        this.room_number = room_number;
        this.roomType = roomType;
        this.hotel = hotel;
        this.floor_number = floor_number;
        this.description = description;
        this.status = status;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }


    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Column(name = "floor_number", nullable = false)
    public int getFloor_number() {
        return floor_number;
    }

    public void setFloor_number(int floor_number) {
        this.floor_number = floor_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

