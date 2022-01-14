package com.example.hoteleye.controllers;

import com.example.hoteleye.models.Account;
import com.example.hoteleye.myutils.AccountException;
import com.example.hoteleye.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Controller
{
    @Autowired
    private AccountService accountService;

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
}