package com.example.hoteleye.services;

import com.example.hoteleye.models.Account;
import com.example.hoteleye.myutils.AccountException;
import com.example.hoteleye.myutils.ReponseResult;
import com.example.hoteleye.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class AccountService{
    @Autowired
    AccountRepository accountRepository;
    ReponseResult response = ReponseResult.getInstance();
    
    public List<Account> list() {
        return accountRepository.findAll();
    }


    public Account getById(Long index) throws AccountException {
        Account account = new Account();
       try{
           account=  accountRepository.findById(index).get();
       } catch (Exception ex){
               response.getException(new AccountException(index));
               System.out.println(response.response("500"));
       }
        return account;
    }

    public Map<String, Object> saveOrUpdate(Account account) {
        accountRepository.save(account);
        return response.response("200");
    }


    public Map<String, Object> delete(Long index)  {
        try{
            accountRepository.deleteById(index);
            return response.response("200");
        }catch (Exception ex){
            response.getException(new AccountException(index));
            System.out.println(response.response("500"));
            return response.response("500");
        }
    }
}
