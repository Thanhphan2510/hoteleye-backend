package com.example.hoteleye.myutils;

public class AccountException extends Exception{

    private static class SingletonHelper{
        private static final AccountException INSTANCE = new AccountException();
    }

    public static AccountException getInstance(){
        return AccountException.SingletonHelper.INSTANCE;
    }
    public AccountException(){

    }
    public AccountException(Long id){

        super("Could not find employee with id: " + id);
    }

//    @Override
//    public String getMessage() {
//        return "Could not find employee";
//    }
}
    