package com.example.hoteleye.controllers;

import com.example.hoteleye.models.Account;
import com.example.hoteleye.models.Hotel;
import com.example.hoteleye.models.Room;
import com.example.hoteleye.myutils.AccountException;
import com.example.hoteleye.services.AccountService;
import com.example.hoteleye.services.HotelService;
import com.example.hoteleye.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Controller
{
    @Autowired
    private AccountService accountService;

    @Autowired
    private HotelService hotelService;
    @Autowired
    private RoomService roomService;
    @RequestMapping("/")
    public String hello()
    {
        return "Hello HOTEL EYE";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<Account> getAllAccount() {
        return accountService.list();
    }


    @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
    Account getAccount(@PathVariable Long id) throws AccountException {
//        System.out.println(id);
        return accountService.getById(id);
    }


    @RequestMapping(value = "/save-account", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> saveAcount(@RequestBody Account account) {
        return accountService.saveOrUpdate(account);
    }

    @DeleteMapping(value = "/delete/{id}")
    public Map<String, Object> deleteAcount(@PathVariable Long id) {
        return accountService.delete(id);
    }

    //========== HOTEL=================//
    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public List<Hotel> getAllHotel() {

            return (List<Hotel>) hotelService.findAll();
    }

//
//    @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
//    Account getAccount(@PathVariable Long id) throws AccountException {
////        System.out.println(id);
//        return accountService.getById(id);
//    }
//
//
//    @RequestMapping(value = "/save-account", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> saveAcount(@RequestBody Account account) {
//        return accountService.saveOrUpdate(account);
//    }
//
//    @DeleteMapping(value = "/delete/{id}")
//    public Map<String, Object> deleteAcount(@PathVariable Long id) {
//        return accountService.delete(id);
//    }

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms() {

        return (List<Room>) roomService.findAll();
    }


}